package com.example.springsecuritydemo.repositories;

import com.example.springsecuritydemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
