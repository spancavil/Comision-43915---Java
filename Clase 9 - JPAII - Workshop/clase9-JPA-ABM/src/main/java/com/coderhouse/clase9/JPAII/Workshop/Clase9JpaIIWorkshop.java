package com.coderhouse.clase9.JPAII.Workshop;

import com.coderhouse.clase9.JPAII.Workshop.model.Client;
import com.coderhouse.clase9.JPAII.Workshop.model.Invoice;
import com.coderhouse.clase9.JPAII.Workshop.model.Product;
import com.coderhouse.clase9.JPAII.Workshop.repository.ClientRepository;
import com.coderhouse.clase9.JPAII.Workshop.repository.InvoiceRepository;
import com.coderhouse.clase9.JPAII.Workshop.repository.ProductRepository;
import jakarta.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@SpringBootApplication
public class Clase9JpaIIWorkshop implements CommandLineRunner {

	@Autowired
	private ProductRepository productoRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private InvoiceRepository invoiceRepository;

	public static void main(String[] args) {
		SpringApplication.run(Clase9JpaIIWorkshop.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening. Access H2 on: http://localhost:8888/h2-console");

		try {
			//Parte 1: creación de clientes
			Client cliente1 = new Client();
			cliente1.setName("Horacio");
			cliente1.setDocnumber("8922812");
			cliente1.setLastname("Guarani");
			this.clientRepository.save(cliente1);

			Client cliente2 = new Client();
			cliente2.setName("Sebas");
			cliente2.setLastname("Ancavil");
			cliente2.setDocnumber("39540113");
			this.clientRepository.save(cliente2);

			Client cliente3 = new Client();
			cliente3.setName("Sebas");
			cliente3.setLastname("Abad");
			cliente3.setDocnumber("39540115");
			this.clientRepository.save(cliente3);

			//Búsqueda con métodos customizados
			List<Client> clientes = this.clientRepository.findByNameLike("%a%");
			System.out.println(clientes.size());
			printClientes(clientes);

			List<Client> clientes2 = this.clientRepository.getByNameOrderedByLastnameJPQL("Sebas");
			System.out.println(clientes2.size());
			printClientes(clientes2);

			List<Client> clientes3 = this.clientRepository.getByNameOrderedByLastnameNativeQuery("Sebas");
			System.out.println(clientes3.size());
			printClientes(clientes3);

			//Parte 2 creación de productos
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
			System.out.println(productoGuardado2);

			//Paso 3: creación de facturas
			Optional<Client> client1 = this.clientRepository.findById(1);

			Invoice invoice1 = new Invoice();
			client1.ifPresent(invoice1::setClient);
			invoice1.setCreated_at("13-03");
			invoice1.setTotal(700);
			this.invoiceRepository.save(invoice1);

			Invoice invoice2 = new Invoice();
			client1.ifPresent(invoice2::setClient);
			invoice2.setCreated_at("15-03");
			invoice2.setTotal(700);
			this.invoiceRepository.save(invoice2);

			Optional<Client> client2 = this.clientRepository.findById(2);

			Invoice invoice3 = new Invoice();
			client2.ifPresent(invoice3::setClient);
			invoice3.setCreated_at("15-03");
			invoice3.setTotal(700);
			this.invoiceRepository.save(invoice3);

			Optional<Client> clientGuardado = this.clientRepository.findById(2);
			//client2 = this.clientRepository.findById(2);
			System.out.println(clientGuardado.get().getInvoice());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static void printClientes (List<Client> listadoClientes) {
		for (Client cliente: listadoClientes
		) {
			System.out.println(cliente);
		}
	}

	static void printInvoices (List<Invoice> listadoFacturas) {
		for (Invoice factura: listadoFacturas
		) {
			System.out.println(factura);
		}
	}
}
