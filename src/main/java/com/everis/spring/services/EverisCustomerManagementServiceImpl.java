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
package com.everis.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.everis.spring.customers.Customer;
import com.everis.spring.customers.Customers;
import com.everis.spring.repository.EverisCustomerRepository;

import java.util.List;
import java.util.Map;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class EverisCustomerManagementServiceImpl implements EverisCustomerManagementServiceI {

	/** Repositorio - Tabla: t_h_customer */
	@Autowired
	private EverisCustomerRepository customerRepository;

	@Override
	public Customer insertNewCustomer(Customer newCustomer) {

		// Verificación de nulidad.
		if (newCustomer != null && newCustomer.getId() == null) {

			// Insercción de cliente.
			
			newCustomer = this.customerRepository.save(newCustomer);
		}
		

		return newCustomer;
	}

	@Override
	public List<Customer> searchAllCustomers() {

		// Consulta clientes.
		final Iterable<Customer> customerList = customerRepository.findAll();

		// Itera e imprime los clientes.
		//customerList.forEach((final Customer customer) -> System.out.println(customer.toString()));
		return this.customerRepository.findAll();
	}

	@Override
	public void searchByFullName(final String name, final String surname1, final String surname2) {

		// Obtención del listado de clientes por nombre completo.
		final List<Customer> searchClients = customerRepository.findByNameAndSurName1AndSurName2(name, surname1, surname2);

		// Muestra el listado obtenido.
		printCustomers(searchClients);
	}

	@Override
	public void searchByName(final String name) {

		// Obtención del listado de clientes por nombre.
		final List<Customer> searchCustomers = customerRepository.buscarPorNombre(name);

		// Muestra el listado obtenido.
		printCustomers(searchCustomers);
	}

	/**
	 * Recorre e imprime listado de clientes.
	 * 
	 * @param searchCustomers
	 */
	private void printCustomers(final List<Customer> searchCustomers) {
		if (!CollectionUtils.isEmpty(searchCustomers)) {
			for (Customer customer : searchCustomers) {
				System.out.println(customer.toString());
			}
		}
	}


}
