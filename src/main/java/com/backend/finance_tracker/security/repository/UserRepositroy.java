package com.backend.finance_tracker.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.finance_tracker.security.entity.User;

@Repository
public interface UserRepositroy extends JpaRepository<User, Long> {

}
