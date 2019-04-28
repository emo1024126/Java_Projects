package com.example.adminclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AdminclientApplication {
	final static Logger logger = LoggerFactory.getLogger(AdminclientApplication.class);

	public static void main(String[] args) { 
		SpringApplication.run(AdminclientApplication.class, args);
	}

	@GetMapping("/test")
	public void print(){
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.debug("debug");
	}

}
