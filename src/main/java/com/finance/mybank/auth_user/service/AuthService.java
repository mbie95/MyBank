package com.finance.mybank.auth_user.service;

import com.finance.mybank.auth_user.dto.LoginRequest;
import com.finance.mybank.auth_user.dto.LoginResponse;
import com.finance.mybank.auth_user.dto.RegistrationRequest;
import com.finance.mybank.auth_user.dto.ResetPasswordRequest;
import com.finance.mybank.res.Response;

public interface AuthService {
    Response<String> register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<?> forgetPassword(String email);
    Response<?> updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}
