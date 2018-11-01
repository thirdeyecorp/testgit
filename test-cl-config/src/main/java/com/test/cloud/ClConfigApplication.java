package com.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ClConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClConfigApplication.class, args);
	}
}
