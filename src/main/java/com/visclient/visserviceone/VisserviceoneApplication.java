package com.visclient.visserviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class VisserviceoneApplication {
	public static void main(String[] args) {
		SpringApplication.run(VisserviceoneApplication.class, args);
	}

	@Value("${message:Hello default}")
	private String message;

	@GetMapping(value="/message")
	public String getData(){
		return null;
	}
}
