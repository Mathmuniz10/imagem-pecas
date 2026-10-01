package com.example.imagemPecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Matheus Muniz
 */
@SpringBootApplication // Classe principal
@EnableJpaAuditing
public class ImagemPecasApplication {

	public static void main(String[] args) { // Inicio da aplicacao
		SpringApplication.run(ImagemPecasApplication.class, args);
	}

}
