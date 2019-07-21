package com.finetech.testbackend.repository;

import com.finetech.testbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<String, User> {
}
