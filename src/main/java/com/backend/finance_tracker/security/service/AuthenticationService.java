package com.backend.finance_tracker.security.service;

import com.backend.finance_tracker.security.dto.JwtAuthenticationResponse;
import com.backend.finance_tracker.security.dto.SignInRequest;
import com.backend.finance_tracker.security.dto.SignUpRequest;
import com.backend.finance_tracker.security.entity.User;

public interface AuthenticationService {

    User signUp(SignUpRequest request);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

}
