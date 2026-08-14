package com.finance.mybank.auth_user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetPasswordRequest {
    private String email;
    private String code;
    private String newPassword;
}
