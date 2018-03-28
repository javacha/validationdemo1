package com.example.javacha.validationdemo1.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Map<String, String> getDatos() {
		Map datos = new HashMap<String, String>();
		
		datos.put("nombre", "javacha");
		datos.put("direccion", "España");
		return datos;
	}
}
