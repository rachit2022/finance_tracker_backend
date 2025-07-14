package com.backend.finance_tracker.security.serviceImpl;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.backend.finance_tracker.security.repository.UserRepository;
import com.backend.finance_tracker.security.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return (String username) -> userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));
    }
}
