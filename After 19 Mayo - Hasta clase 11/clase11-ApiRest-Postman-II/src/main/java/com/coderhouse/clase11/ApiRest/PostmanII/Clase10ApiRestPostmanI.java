package com.coderhouse.clase11.ApiRest.PostmanII;

import com.coderhouse.clase11.ApiRest.PostmanII.model.Client;
import com.coderhouse.clase11.ApiRest.PostmanII.model.Product;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.ClientRepository;
import com.coderhouse.clase11.ApiRest.PostmanII.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase10ApiRestPostmanI implements CommandLineRunner {

	@Autowired
	private ProductRepository productoRepository;

	@Autowired
	private ClientRepository clientRepository;


	public static void main(String[] args) {
		SpringApplication.run(Clase10ApiRestPostmanI.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Carga automática de clientes y productos
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
			/*List<Client> clientes = this.clientRepository.findByNameLike("%a%");
			System.out.println(clientes.size());
			printClientes(clientes);

			List<Client> clientes2 = this.clientRepository.getByNameOrderedByLastnameJPQL("Sebas");
			System.out.println(clientes2.size());
			printClientes(clientes2);

			List<Client> clientes3 = this.clientRepository.getByNameOrderedByLastnameNativeQuery("Sebas");
			System.out.println(clientes3.size());
			printClientes(clientes3);
*/
			//Parte 2 creación de productos
			Product remera = new Product();
			remera.setCode("SJSxnms2992Ajkx");
			remera.setDescription("Una bonita remera azul");
			remera.setPrice(24.99);
			remera.setStock(100);
			this.productoRepository.save(remera);

			Product auricularesBT = new Product();
			auricularesBT.setCode("xnksasdSSascs");
			auricularesBT.setDescription("Duran una banda la batería");
			auricularesBT.setPrice(35.99);
			auricularesBT.setStock(200);
			this.productoRepository.save(auricularesBT);

			Product sillaLuxor = new Product();
			sillaLuxor.setCode("23sjcszbt");
			sillaLuxor.setDescription("Lujo y comodidad");
			sillaLuxor.setPrice(66.56);
			sillaLuxor.setStock(350);
			this.productoRepository.save(sillaLuxor);

			Product setVajillas = new Product();
			setVajillas.setCode("223123");
			setVajillas.setDescription("Completísimo set de vajillas");
			setVajillas.setPrice(66.56);
			setVajillas.setStock(350);
			this.productoRepository.save(setVajillas);

			Product poste = new Product();
			poste.setCode("282812");
			poste.setDescription("Enorme poste de luz de 22 Gigowatts");
			poste.setPrice(120.22);
			poste.setStock(100);
			this.productoRepository.save(poste);

			System.out.println("Server listening. Access H2 on: http://localhost:8888/h2-console");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/*static void printClientes (List<Client> listadoClientes) {
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
	}*/
}
