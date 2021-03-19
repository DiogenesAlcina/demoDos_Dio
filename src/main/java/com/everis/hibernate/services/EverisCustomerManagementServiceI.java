package com.everis.hibernate.services;

import java.util.List;

import com.everis.hibernate.persistence.EverisCustomer;

/**
 * Formación Hibernate.
 * 
 * @author Everis
 *
 */
public interface EverisCustomerManagementServiceI {

	/**
	 * Inserta un nuevo cliente.
	 * 
	 * @param newCustomer
	 */
	public void insertNewCustomer(final EverisCustomer newCustomer);

	/**
	 * Actualiza un cliente existente.
	 * 
	 * @param newCustomer
	 */
	public void updateNewCustomer(final EverisCustomer updatedCustomer);

	/**
	 * Elimina un cliente existente.
	 * 
	 * @param deleteCustomer
	 */
	public void deleteCustomer(final EverisCustomer deletedCustomer);

	/**
	 * Obtiene un cliente mediante su ID.
	 * 
	 * @param id
	 */
	public EverisCustomer searchById(final Long id);

	/**
	 * Obtiene un cliente por su nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @return List<EverisCustomer>
	 */
	public List<EverisCustomer> searchByFullName(final String name, final String surname1, final String surname2);

	/**
	 * Obtiene todos los clientes existentes.
	 * 
	 * @return List<EverisCustomer>
	 */
	public List<EverisCustomer> searchAll();

}
