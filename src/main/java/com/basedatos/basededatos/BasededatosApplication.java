package com.basedatos.basededatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages = {"com.basedatos.basededatos.dao.UserDao"})
@ComponentScan(basePackages = {"com.basedatos.basededatos.controllers.UserController"})

@ComponentScan(basePackages = {"com.basedatos.basededatos.dao.ProducerDao"})
@ComponentScan(basePackages = {"com.basedatos.basededatos.controllers.ProducerController"})

public class BasededatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasededatosApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("http://localhost:5173").allowedMethods("GET","PUT","POST","DELETE").allowedHeaders("");
			}
		};
	}
}
