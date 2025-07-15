package com.backend.finance_tracker.security.dto;

import lombok.Data;

@Data
public class SignInRequest {

    private String email;
    
    private String password;

}
