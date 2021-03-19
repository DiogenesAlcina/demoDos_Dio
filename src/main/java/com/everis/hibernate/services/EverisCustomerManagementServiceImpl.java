package com.everis.hibernate.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.everis.hibernate.persistence.EverisCustomer;
import com.everis.hibernate.persistence.EverisCustomerDaoI;

/**
 * Formación Hibernate.
 * 
 * @author Everis
 *
 */
@Service
public class EverisCustomerManagementServiceImpl implements EverisCustomerManagementServiceI {

	/** DAO: ht_customer */
	@Autowired
	private EverisCustomerDaoI customerDao;

	@Override
	@Transactional
	public void insertNewCustomer(final EverisCustomer newCustomer) {

		// Verificación de nulidad e inexistencia.
		if (newCustomer != null && newCustomer.getId() == null) {

			// Insercción del nuevo cliente.
			customerDao.insert(newCustomer);
		}

	}

	@Override
	@Transactional
	public void updateNewCustomer(final EverisCustomer updatedCustomer) {

		// Verificación de nulidad y existencia.
		if (updatedCustomer != null && updatedCustomer.getId() != null) {

			// Actualización del cliente.
			customerDao.update(updatedCustomer);
		}

	}

	@Override
	@Transactional
	public void deleteCustomer(final EverisCustomer deletedCustomer) {

		// Verificación de nulidad y existencia.
		if (deletedCustomer != null && deletedCustomer.getId() != null) {
			
			// Eliminación del cliente.
			customerDao.delete(deletedCustomer);
		}

	}

	@Override
	@Transactional
	public EverisCustomer searchById(final Long id) {

		// Resultado.
		EverisCustomer customer = null;

		// Verificación de nulidad.
		if (id != null) {

			// Obtención del cliente por ID.
			customer = customerDao.searchById(id);
		}

		return customer;
	}

	@Override
	@Transactional
	public List<EverisCustomer> searchByFullName(final String name, final String surname1, final String surname2) {

		// Resultado.
		List<EverisCustomer> customersList = new ArrayList<EverisCustomer>();

		// Verificación de nulidad.
		if (StringUtils.hasText(name) && StringUtils.hasText(surname1) && StringUtils.hasText(surname2)) {

			// Obtención del cliente por nombre completo.
			customersList = customerDao.searchByCustomerFullName(name, surname1, surname2);
		}

		return customersList;
	}

	@Override
	@Transactional
	public List<EverisCustomer> searchAll() {

		// Resultado.
		List<EverisCustomer> customersList = new ArrayList<EverisCustomer>();

		// Obtención de clientes.
		customersList = customerDao.searchAll();

		return customersList;
	}

}
