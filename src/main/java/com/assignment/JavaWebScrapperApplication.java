package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.service.Scrapper;

@SpringBootApplication
public class JavaWebScrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebScrapperApplication.class, args);
		
		Scrapper scrapper=new Scrapper();
		scrapper.scrape();
	}

}
