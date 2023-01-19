package com.spring.configserver;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		/*SpringApplication app = new SpringApplication(ConfigServerApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		app.run(args);*/
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
