package com.example.imagemPecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Matheus Muniz
 */
@SpringBootApplication
@EnableJpaAuditing
public class ImagemPecasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagemPecasApplication.class, args);
	}

}
