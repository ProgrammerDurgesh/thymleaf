package com.durgesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ThymleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymleafApplication.class, args);
		System.out.println("this is Home page");
	}

//	@Bean
//	BCryptPasswordEncoder bCryptPasswordEncoder()
//	{
//		return  new BCryptPasswordEncoder();
//	}



}
