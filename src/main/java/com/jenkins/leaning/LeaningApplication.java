package com.jenkins.leaning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LeaningApplication {

	public static void main(String[] args) {
		System.out.println("Welcome from Maven Project");
		SpringApplication.run(LeaningApplication.class, args);
	}

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        	return builder.sources(LeaningApplication.class);
    	}

}
