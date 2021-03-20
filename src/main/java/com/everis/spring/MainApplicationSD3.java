/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.everis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.spring.customers.Customer;
import com.everis.spring.services.EverisCustomerManagementServiceI;


/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication(proxyBeanMethods = false)
public class MainApplicationSD3 implements CommandLineRunner {
	
	@Autowired
	private EverisCustomerManagementServiceI customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplicationSD3.class, args);
		

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("----- EVERIS SYS - INI -----");

		// Nuevos clientes.
		Customer newCustomer1 = new Customer();
		newCustomer1.setId(1);
		newCustomer1.setName("Alejandro");
		newCustomer1.setSurName1("Téllez");
		newCustomer1.setSurName2("Rubio");
		newCustomer1.setIdentityDocNumber("28999666A");
		customerService.insertNewCustomer(newCustomer1);

		final Customer newCustomer2 = new Customer();
		newCustomer2.setId(2);
		newCustomer2.setName("Alejandro");
		newCustomer2.setSurName1("Brazo");
		newCustomer2.setSurName2("Luque");
		newCustomer2.setIdentityDocNumber("30111555B");
		customerService.insertNewCustomer(newCustomer2);

		final Customer newCustomer3 = new Customer();
		newCustomer3.setId(3);
		newCustomer3.setName("Estefanía");
		newCustomer3.setSurName1("Cano");
		newCustomer3.setSurName2("Muñiz");
		newCustomer3.setIdentityDocNumber("27000888C");
		customerService.insertNewCustomer(newCustomer3);

		System.out.println("----- INICIO TODOS LOS CLIENTES -----");
		
		// Muestra todos los clientes.
		customerService.searchAllCustomers();
		
		System.out.println("----- FIN TODOS LOS CLIENTES -----");

		System.out.println("----- INICIO TODOS LOS CLIENTES POR NOMBRE -----");
		
		// Obtiene los clientes por nombre.
		customerService.searchByName("Alejandro");

		System.out.println("----- FIN TODOS LOS CLIENTES POR NOMBRE -----");
		
		System.out.println("----- FIN TODOS LOS CLIENTES POR NOMBRE Y APELLIDOS -----");
		
		// Obtiene los clientes por nombre y apellidos.
		customerService.searchByFullName("Alejandro", "Téllez", "Rubio");

		System.out.println("----- FIN TODOS LOS CLIENTES POR NOMBRE Y APELLIDOS -----");
		
		System.out.println("----- EVERIS SYS - FIN -----");

	
}
		
	}


