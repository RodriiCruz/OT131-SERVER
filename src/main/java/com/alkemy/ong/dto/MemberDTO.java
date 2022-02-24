package com.alkemy.ong.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.alkemy.ong.model.Members;

import lombok.*;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    
    private Long id;
    @NotNull (message = "Field name can't be null")
    @NotBlank (message = "Field name can't be empty")
    private String name;
    private String facebookUrl;
    private String instagramUrl;
    private String linkedinUrl;
    private String image;
    private String description;

}
