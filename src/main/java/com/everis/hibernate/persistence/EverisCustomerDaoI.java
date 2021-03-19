package com.everis.hibernate.persistence;

import java.util.List;

/**
 * Formación Patrón DAO.
 * 
 * @author Everis
 *
 */
public interface EverisCustomerDaoI {

	/* *** MÉTODOS SUSCEPTIBLES DE DAO GENÉRICO *** */
	/**
	 * Inserta un cliente en BBDD.
	 * 
	 * @param newCustomer
	 */
	public void insert(EverisCustomer newCustomer);

	/**
	 * Actualiza un cliente de BBDD.
	 * 
	 * @param updCustomer
	 */
	public void update(EverisCustomer updCustomer);

	/**
	 * Elimina un cliente en BBDD.
	 * 
	 * @param paramT
	 */
	public void delete(EverisCustomer delCustomer);

	/**
	 * Localiza un cliente por ID en BBDD.
	 * 
	 * @param d
	 * @return EverisCustomer
	 */
	public EverisCustomer searchById(final Long id);

	/**
	 * Búsqueda de todos los clientes en BBDD.
	 * 
	 * @return List<EverisCustomer>
	 */
	public List<EverisCustomer> searchAll();

	/* *** MÉTODOS FUNCIONALMENTE PROPIOS DE LA TABLA CLIENTES *** */

	/**
	 * Obtiene un cliente por nombre completo.
	 * 
	 * @param paramT
	 * @return List<EverisCustomer>
	 */
	public List<EverisCustomer> searchByCustomerFullName(final String name, final String surname1, final String surname2);

}
