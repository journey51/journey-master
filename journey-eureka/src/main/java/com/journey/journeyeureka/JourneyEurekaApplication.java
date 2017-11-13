package com.journey.journeyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JourneyEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JourneyEurekaApplication.class, args);
	}
}
