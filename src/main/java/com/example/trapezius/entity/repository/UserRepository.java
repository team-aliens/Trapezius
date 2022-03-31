package com.example.trapezius.entity.repository;

import com.example.trapezius.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
