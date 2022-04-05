package com.example.trapezius.entity.repository;

import com.example.trapezius.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
