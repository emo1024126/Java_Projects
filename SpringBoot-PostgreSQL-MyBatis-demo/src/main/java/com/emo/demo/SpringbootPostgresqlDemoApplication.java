package com.emo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.emo.demo.dao")
@SpringBootApplication
public class SpringbootPostgresqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlDemoApplication.class, args);
	}

}
