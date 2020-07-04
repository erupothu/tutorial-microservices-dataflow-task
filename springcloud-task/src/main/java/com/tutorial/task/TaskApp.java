package com.tutorial.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;

@SpringBootApplication
@EnableTask
public class TaskApp implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(TaskApp.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Welcome to Task");

	}

	@BeforeTask
	public void start(TaskExecution taskExecution) {
		System.out.println("TaskName : " + taskExecution.getTaskName() + " Execution Id : "
				+ taskExecution.getExecutionId() + " started...");

	}

	@AfterTask
	public void end(TaskExecution taskExecution) {
		System.out.println("TaskName : " + taskExecution.getTaskName() + " Execution Id : "
				+ taskExecution.getExecutionId() + " completed...");

	}

	@FailedTask
	public void fail(TaskExecution taskExecution, Throwable throwable) {
		System.out.println("TaskName : " + taskExecution.getTaskName() + " Execution Id : "
				+ taskExecution.getExecutionId() + " failed...");

	}

}
