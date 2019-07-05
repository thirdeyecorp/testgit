package com.sb.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
@de.codecentric.boot.admin.config.EnableAdminServer
public class SbAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAdminApplication.class, args);
	}

}
