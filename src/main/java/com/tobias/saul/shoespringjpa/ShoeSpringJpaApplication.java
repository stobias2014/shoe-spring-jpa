package com.tobias.saul.shoespringjpa;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tobias.saul.shoespringjpa.model.Shoe;
import com.tobias.saul.shoespringjpa.service.ShoeService;

@SpringBootApplication
public class ShoeSpringJpaApplication {
	
	@Autowired
	ShoeService shoeService;

	public static void main(String[] args) {
		SpringApplication.run(ShoeSpringJpaApplication.class, args);
	}
}
