package com.tasksapp.service;


import com.tasksapp.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    public Iterable<Task> list();

    Task save(Task task);

}
