package com.easttobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CategoryServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryServiceApiApplication.class, args);
	}

}
