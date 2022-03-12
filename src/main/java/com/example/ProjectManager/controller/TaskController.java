package com.example.ProjectManager.controller;

import com.example.ProjectManager.models.Task;
import com.example.ProjectManager.models.User;
import com.example.ProjectManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getTasksByProjectName(String projectName){
        return taskRepository.findAll();
    }

}
