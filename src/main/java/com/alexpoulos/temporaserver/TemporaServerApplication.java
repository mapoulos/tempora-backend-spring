package com.alexpoulos.temporaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TemporaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemporaServerApplication.class, args);
	}

}
