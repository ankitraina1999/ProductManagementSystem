package com.cybage.ProductManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
@EnableJpaRepositories
public class ProductManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementSystemApplication.class, args);
	}

}