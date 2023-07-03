package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
	@GetMapping("/getMessage")
	public ResponseEntity<String> getMessage()
	{

		return new ResponseEntity<String>(" Weclome to Docker ", HttpStatus.ACCEPTED);
	}

	public static void main(String[] args) {

		SpringApplication.run(DockerApplication.class, args);


	}

}
