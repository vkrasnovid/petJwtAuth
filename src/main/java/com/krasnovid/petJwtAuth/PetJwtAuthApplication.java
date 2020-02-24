package com.krasnovid.petJwtAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PetJwtAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetJwtAuthApplication.class, args);
	}

}
