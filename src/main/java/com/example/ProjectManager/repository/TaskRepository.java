package com.example.ProjectManager.repository;

import com.example.ProjectManager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    Task findByTaskName(String taskName);

    @Query(value = "select * from task where upper(project_name) like ?1", nativeQuery = true)
    List<Task> searchTasksByName(String taskNameSearch);

}
