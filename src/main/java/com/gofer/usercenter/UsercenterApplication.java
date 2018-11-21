package com.gofer.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 73956
 */
@SpringBootApplication
@EnableEurekaClient
public class UsercenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsercenterApplication.class, args);
	}
}
