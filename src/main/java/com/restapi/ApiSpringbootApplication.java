package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class ApiSpringbootApplication {

	@GetMapping("/hello")
	public String hello(){
		return "springboot rest-api testing 3" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringbootApplication.class, args);
	}

}
