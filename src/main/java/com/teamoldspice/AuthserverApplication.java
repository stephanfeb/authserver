package com.teamoldspice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableResourceServer
public class AuthserverApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args){
		SpringApplication.run(AuthserverApplication.class, args);
	}
}
