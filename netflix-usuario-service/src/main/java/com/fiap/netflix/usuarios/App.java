package com.fiap.netflix.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class App {

	public static void main(String[] args) {
		// if (createArchiveDisk()) {
		SpringApplication.run(App.class, args);
		// }
	}

	@GetMapping(value = "/home")
	public String start() {
		return "Aplicação iniciada com sucesso";
	}

}
