package com.swayzetrain.utility.proceduralmap.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({ "com.swayzetrain.utility.proceduralmap" })

@SpringBootApplication
public class Init {

	public static void main(String[] args) {
		SpringApplication.run(Init.class, args);
	}

}
