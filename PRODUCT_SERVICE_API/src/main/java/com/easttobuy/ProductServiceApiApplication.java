package com.easttobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.easttobuy.CouponClient"})
@EnableDiscoveryClient
public class ProductServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApiApplication.class, args);
	}

}
