package com.tasksapp;

import com.tasksapp.domain.Task;
import com.tasksapp.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L, "Create Spring Boot Aplication", LocalDate.now(), true));
            taskService.save(new Task(2L, "Create Spring Project Peckages", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(3L, "Create Task domain class", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
            taskService.save(new Task(4L, "Create Service and repository classes", LocalDate.now().plus(2, ChronoUnit.DAYS), false));
            taskService.save(new Task(5L, "Create the command line runner to load data", LocalDate.now().plus(6, ChronoUnit.DAYS
            ), false));
            taskService.save(new Task(6L, "Create the required configuration properties", LocalDate.now().plus(10, ChronoUnit.DAYS), false));
            taskService.save(new Task(7L, "Run the Spring Boot Aplication", LocalDate.now().plus(12, ChronoUnit.DAYS), false));
            taskService.save(new Task(8L, "Chech the H2 Console for the initial data", LocalDate.now().plus(13, ChronoUnit.DAYS), false));
        };
    }

}
