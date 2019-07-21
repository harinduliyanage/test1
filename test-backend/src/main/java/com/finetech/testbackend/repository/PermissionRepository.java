package com.finetech.testbackend.repository;

import com.finetech.testbackend.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Long, Permission> {
}
