package com.example.imagemPecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
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

	@EventListener(org.springframework.boot.context.event.ApplicationReadyEvent.class)
	public void openBrowser() {
		System.setProperty("java.awt.headless", "false");
		try {
			java.awt.Desktop.getDesktop().browse(new java.net.URI("http://localhost:8080/v1/images"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}