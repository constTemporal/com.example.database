package com.example.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DatabaseApplication.class, args);

		CocheRepository repo = context.getBean(CocheRepository.class);
		
		Coche mazda = new Coche(null, "RX7", "Mazda", 2004);

		repo.save(mazda);

		System.out.println(repo.count());
		System.out.println(repo.findAll());
	}

}
