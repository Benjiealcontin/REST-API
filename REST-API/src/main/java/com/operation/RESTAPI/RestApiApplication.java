package com.operation.RESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//Controller
@ComponentScan("com.operation.Controller")
//Dao
@ComponentScan("com.operation.Service")
//Model
@EntityScan("com.operation.Model")
//Respository
@EnableJpaRepositories("com.operation.Respository")

public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
