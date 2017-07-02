package com.miras.cachedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableCaching
public class CacheDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheDemoApplication.class, args);
	}
}
