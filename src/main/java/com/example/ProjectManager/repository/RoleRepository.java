package com.example.ProjectManager.repository;

import com.example.ProjectManager.models.Role;
import com.example.ProjectManager.models.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(RoleEnum roleUser);
}
