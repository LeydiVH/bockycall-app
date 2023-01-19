package com.spring.catalogueservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class CatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CatalogueServiceApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8084"));
		app.run(args);
		//SpringApplication.run(CatalogueServiceApplication.class, args);
	}

}
