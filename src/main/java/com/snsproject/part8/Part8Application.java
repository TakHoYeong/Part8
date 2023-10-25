package com.snsproject.part8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Part8Application {

	public static void main(String[] args) {
		SpringApplication.run(Part8Application.class, args);
	}

}
