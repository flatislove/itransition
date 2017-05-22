package com.itransition.repository;

import com.itransition.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findOneByUsername(String username);
}