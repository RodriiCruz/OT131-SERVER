package com.alkemy.ong.util;

import com.alkemy.ong.dto.UsersDtoResponse;
import com.alkemy.ong.dto.UsersOkDto;
import com.alkemy.ong.service.UsersService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

@Service
public class JWT {
    
    private final Integer EXPIRACION = 1 ; //set time in hours
    private final String BEARER = "Bearer ";
    private final String SECRET_KEY = "SECRET_KEY";
    private final String AUTHORITIES = "authorities";
    private static final String BEARER_TOKEN = "Bearer %s";
    private static final String BEARER_PART = "Bearer ";
    private static final String EMPTY = "";
    
    @Autowired
    protected UsersService usersService;
    
    public String createToken(Map<String,Object> claims, String subject, String role){
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(role);
        String token = Jwts.builder().setSubject(subject)
                .claim( AUTHORITIES, grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*EXPIRACION))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY.getBytes(StandardCharsets.UTF_8)).compact();
        return String.format(BEARER, token);
    }
    
    public String generateToken(UsersDtoResponse login) {
        
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, login.getEmail(), usersService.findByMail(login.getEmail()).get().getRole().getName().toString());
    }
    
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY.getBytes(StandardCharsets.UTF_8)).parseClaimsJws(token).getBody();
    }
    
    public String extractUserEmail(String authorizationHeader) {
        String token = authorizationHeader.replace(BEARER_PART, EMPTY);
        return extractClaim(token, Claims::getSubject);
    }
}