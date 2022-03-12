package com.example.ProjectManager.repository;

import com.example.ProjectManager.models.Project;
import com.example.ProjectManager.models.Task;
import com.example.ProjectManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface ProjectRepository extends JpaRepository<Project, UUID> {

    Project findByProjectName(String projectName);

    @Query(value = "select * from project where upper(project_name) like ?1", nativeQuery = true)
    List<Project> searchProjectsByName(String projectNameSearch);
}
