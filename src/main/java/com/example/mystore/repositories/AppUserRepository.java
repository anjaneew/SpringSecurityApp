package com.example.mystore.repositories;

import com.example.mystore.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    public AppUser findByEmail(String email);

}
