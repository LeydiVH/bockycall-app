package com.spring.internetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InternetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetServiceApplication.class, args);
	}

}
