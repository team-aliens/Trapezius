package com.example.trapezius.service;

import com.example.trapezius.api.dto.LoginRequest;
import com.example.trapezius.api.dto.SignupRequest;
import com.example.trapezius.entity.User;
import com.example.trapezius.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String signup(SignupRequest request) {
        userRepository.save(new User(request.getId(), request.getPassword(), request.getName()));
        return "회원가입 성공";
    }

    public String login(LoginRequest request) {
        if (userRepository.findById(request.getId()).get().getPassword() == request.getPassword());
        return "로그인 성공";
    }
}
