package com.finetech.testbackend.repository;

import com.finetech.testbackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Long, Role> {
}
