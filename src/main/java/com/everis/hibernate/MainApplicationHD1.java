package com.everis.hibernate;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import com.everis.hibernate.persistence.EverisCustomer;
import com.everis.hibernate.services.EverisCustomerManagementServiceI;

/**
 * Formación Hibernate.
 * 
 * @author Everis
 *
 */
@SpringBootApplication
public class MainApplicationHD1 implements CommandLineRunner {

	/** Servicio: gestión de clientes */
	@Autowired
	private EverisCustomerManagementServiceI customerService;

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainApplicationHD1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Nuevo cliente 1.
		EverisCustomer customer1 = new EverisCustomer();
		customer1.setId(1L);
		customer1.setIdentityDocNumber("11222333");
		customer1.setName("Alejandro");
		customer1.setSurName1("Téllez");
		customer1.setSurName2("Rubio");
		customer1.setUpdatedDate(new Date());
		customer1.setUpdatedUser("SYS EVERIS");

		// Nuevo cliente 2.
		EverisCustomer customer2 = new EverisCustomer();
		customer1.setId(2L);
		customer2.setIdentityDocNumber("44555666B");
		customer2.setName("Alejandro");
		customer2.setSurName1("Cabrera");
		customer2.setSurName2("Martín");
		customer2.setUpdatedDate(new Date());
		customer2.setUpdatedUser("SYS EVERIS");

		// Nuevo cliente 3.
		EverisCustomer customer3 = new EverisCustomer();
		customer1.setId(3L);
		customer3.setIdentityDocNumber("77888999C");
		customer3.setName("Ainara");
		customer3.setSurName1("Téllez");
		customer3.setSurName2("Campano");
		customer3.setUpdatedDate(new Date());
		customer3.setUpdatedUser("SYS EVERIS EXTERNAL");

		// Nuevo cliente 4.
		EverisCustomer customer4 = new EverisCustomer();
		customer1.setId(4L);
		customer4.setIdentityDocNumber("00555000D");
		customer4.setName("Emilio");
		customer4.setSurName1("García");
		customer4.setSurName2("Delgado");
		customer4.setUpdatedDate(new Date());
		customer4.setUpdatedUser("SYS EVERIS EXTERNAL");

		// Insercción de clientes.
		customerService.insertNewCustomer(customer1);
		customerService.insertNewCustomer(customer2);
		customerService.insertNewCustomer(customer3);
		customerService.insertNewCustomer(customer4);
		

		// Eliminación de clientes.
		//customer4.setId(4L);		
		customerService.deleteCustomer(customer4);

		// Obtención de la lista de clientes insertados.
		List<EverisCustomer> customersList = customerService.searchAll();
		if (!CollectionUtils.isEmpty(customersList)) {
			System.out.println("Total de clientes registrados: " + customersList.size());
			for (EverisCustomer customer : customersList) {
				System.out.println(customer.toString() + "\n");
			}
		}

		// Obtención de cliente por ID.
		final Long searchId = 2L;
		final EverisCustomer searchedCustomer = customerService.searchById(searchId);

		if (searchedCustomer != null) {
			System.out.println("Se ha localizado el cliente con ID " + searchId + ":");
			System.out.println(searchedCustomer.toString());
		}

		// Obtención de cliente por nombre completo.
		final List<EverisCustomer> customersByNameList = customerService.searchByFullName("Alejandro", "Téllez", "Rubio");

		if (!CollectionUtils.isEmpty(customersByNameList)) {
			System.out.println("Total de clientes registrados con el mismo nombre: " + customersByNameList.size());
			for (EverisCustomer customer : customersByNameList) {
				System.out.println(customer.toString() + "\n");
			}
		}

	}

}
