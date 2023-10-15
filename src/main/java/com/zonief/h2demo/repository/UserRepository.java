package com.zonief.h2demo.repository;

import com.zonief.h2demo.domain.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, String> {

}
