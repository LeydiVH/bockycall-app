package com.spring.networkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetworkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkServiceApplication.class, args);
	}

}
