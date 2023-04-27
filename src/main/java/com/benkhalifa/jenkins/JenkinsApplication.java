package com.benkhalifa.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {
	@GetMapping("/")
	 public String home() {
		 return "Welcome To Jenkins!";
	 }

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
