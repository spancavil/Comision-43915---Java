package com.coderhouse.Clase3.Servicio.REST.externo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Clase13ServicioRestExternoApplication implements CommandLineRunner {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(Clase13ServicioRestExternoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App running on  Check h2 console on http://localhost:" + port + "/api/v1");
		System.out.println("Check h2 console on http://localhost:" + port + "/h2");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

}
