package com.company.hospitalmanagementsystem.controller;


import com.company.hospitalmanagementsystem.dto.UserDto;
import com.company.hospitalmanagementsystem.models.LoginRequest;
import com.company.hospitalmanagementsystem.models.LoginResponse;
import com.company.hospitalmanagementsystem.models.UserEntity;
import com.company.hospitalmanagementsystem.services.impl.AuthService;
import com.company.hospitalmanagementsystem.services.impl.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    UserService userService;
    private final AuthService authService;

    private final ObjectMapper objectMapper;
    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest loginRequest) {
        return authService.loginResponse(loginRequest.getEmail(), loginRequest.getPassword());
    }
    @PostMapping("/auth/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto user) {
       UserEntity userEntity= objectMapper.convertValue(user, UserEntity.class);
        System.out.println(user);
        System.out.println(userEntity);
        userService.saveUser(userEntity);
        return ResponseEntity.ok(user);
    }
}
