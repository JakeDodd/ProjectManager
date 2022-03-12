package com.example.ProjectManager.controller;

import com.example.ProjectManager.models.Project;
import com.example.ProjectManager.models.User;
import com.example.ProjectManager.repository.ProjectRepository;
import com.example.ProjectManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/project")
@RestController
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getProject(){
        return projectRepository.findAll();
    }

    @GetMapping("/api/project/projectSearch/{projectNameSearch}")
    public List<Project> searchProjectsByName(@PathVariable String projectNameSearch){
        List<Project> projects = projectRepository.searchProjectsByName("%" + projectNameSearch.toUpperCase() + "%");
        return projects;
    }



}
