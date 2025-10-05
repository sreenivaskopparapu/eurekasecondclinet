package com.example.eurekaclienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclienttwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclienttwoApplication.class, args);
	}

}
