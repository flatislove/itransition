package com.itransition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItransitionTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItransitionTaskApplication.class, args);
		System.out.println("f");
		for (int i = 0; i <3 ; i++) {
			System.out.println("4");
		}
	}
}
