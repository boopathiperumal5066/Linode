package com.linode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.linode")
@EnableSwagger2
@EnableMongoRepositories
@SpringBootApplication
public class LinodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinodeApplication.class, args);
	}

}
