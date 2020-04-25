package com.easttobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.easttobuy"} )
@ComponentScan(basePackages={"com.easttobuy"})
@EnableDiscoveryClient
public class ProductServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApiApplication.class, args);
	}

}
