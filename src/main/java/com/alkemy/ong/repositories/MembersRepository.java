package com.alkemy.ong.repositories;

import com.alkemy.ong.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<Members, Long>{
    
}
