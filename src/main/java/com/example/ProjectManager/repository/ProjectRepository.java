package com.example.ProjectManager.repository;

import com.example.ProjectManager.models.Project;
import com.example.ProjectManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {

}
