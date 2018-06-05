package com.example.demo.hazel.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringHazelCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHazelCacheApplication.class, args);
	}
}
