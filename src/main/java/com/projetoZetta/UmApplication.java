package com.projetoZetta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.projetoZetta.model" })
@EnableJpaRepositories(basePackages = { "com.projetoZetta.repository" })
@ComponentScan(basePackages = {"com.projetoZetta.controller"})
public class UmApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmApplication.class, args);
	}

}
