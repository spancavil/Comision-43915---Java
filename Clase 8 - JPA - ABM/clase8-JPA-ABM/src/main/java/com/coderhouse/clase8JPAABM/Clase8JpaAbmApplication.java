package com.coderhouse.clase8JPAABM;

import com.coderhouse.clase8JPAABM.model.Product;
import com.coderhouse.clase8JPAABM.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class Clase8JpaAbmApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Clase8JpaAbmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening on. http://localhost:8888/h2-console");
		/*Product taza = new Product();
		taza.setCode("asdincxksS");
		taza.setDescription("400 mL");
		taza.setPrice(10);
		taza.setStock(100);
		this.productoRepository.save(taza);*/
		Optional<Product> productoObtenido = this.productoRepository.findById(6);

		if (productoObtenido.isPresent()) System.out.println(productoObtenido.get());
		else System.out.println("No se encontro el producto especificado");
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening. Access H2 on: http://localhost:8888/h2-console");

		try {
			Product remera = new Product();
			remera.setCode("SJSxnms2992Ajkx");
			remera.setDescription("Una bonita remera azul");
			remera.setPrice(3000);
			remera.setStock(10);
			this.productoRepository.save(remera);

			Product auricularesBT = new Product();
			auricularesBT.setCode("xnksasdSSascs");
			auricularesBT.setDescription("Duran una banda la batería");
			auricularesBT.setPrice(10000);
			auricularesBT.setStock(20);
			this.productoRepository.save(auricularesBT);

			Optional<Product> productoGuardado1 = this.productoRepository.findById(1);
			Optional<Product> productoGuardado2 = this.productoRepository.findById(2);

			System.out.println(productoGuardado1);
			System.out.println(productoGuardado2);*/
		/*} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}*/
}
