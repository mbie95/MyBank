package com.finance.mybank.auth_user.controller;

import com.finance.mybank.auth_user.dto.LoginRequest;
import com.finance.mybank.auth_user.dto.LoginResponse;
import com.finance.mybank.auth_user.dto.RegistrationRequest;
import com.finance.mybank.auth_user.dto.ResetPasswordRequest;
import com.finance.mybank.auth_user.service.AuthService;
import com.finance.mybank.res.Response;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Response<String>> register(@RequestBody @Valid RegistrationRequest registrationRequest) {
        return ResponseEntity.ok(authService.register(registrationRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Response<LoginResponse>> login(@RequestBody @Valid LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<Response<?>> forgotPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        return ResponseEntity.ok(authService.forgetPassword(resetPasswordRequest.getEmail()));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<Response<?>> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        return ResponseEntity.ok(authService.updatePasswordViaResetCode(resetPasswordRequest));
    }

}
