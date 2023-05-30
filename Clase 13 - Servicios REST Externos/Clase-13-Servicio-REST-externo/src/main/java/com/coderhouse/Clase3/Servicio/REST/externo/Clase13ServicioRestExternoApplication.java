package com.coderhouse.Clase3.Servicio.REST.externo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase13ServicioRestExternoApplication implements CommandLineRunner {

	//A través de @Value accedemos a las variables de application.properties
	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(Clase13ServicioRestExternoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App running on  Check h2 console on http://localhost:"+ port + "/api/v1");
		System.out.println("Check h2 console on http://localhost:"+ port + "/h2");
	}

}
