package com.itau.solicitudes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.itau.solicitudes.data.repositories")
@EntityScan("com.itau.solicitudes.data.entities")
public class SolicitudesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolicitudesApiApplication.class, args);
	}

}

