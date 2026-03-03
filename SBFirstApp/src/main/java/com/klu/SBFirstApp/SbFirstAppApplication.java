package com.klu.SBFirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnCheckpointRestore;

@SpringBootApplication

public class SbFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbFirstAppApplication.class, args);
		System.out.println("welcome");
	}

}
