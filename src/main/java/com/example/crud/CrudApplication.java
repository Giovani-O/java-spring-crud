package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Classe principal do projeto
// Para iniciar um projeto com Spring, use https://start.spring.io/;

@SpringBootApplication // Anotação que define que essa classe é a classe principal do Spring Boot
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
