package com.everis.hibernate.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Formación Patrón DAO.
 * 
 * @author Everis
 *
 */
@Repository
public class EverisCustomerDaoImpl implements EverisCustomerDaoI {

	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(EverisCustomer newCustomer) {

		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Apertura de transacción.
		// currentSession.getTransaction().begin();

		// Insercción.
		currentSession.save(newCustomer);

		// Cierre de sesión.
		currentSession.close();

	}

	@Override
	@Transactional
	public void update(final EverisCustomer updCustomer) {

		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Apertura de transacción.
		// currentSession.getTransaction().begin();

		// Insercción.
		currentSession.saveOrUpdate(updCustomer);

		// Cierre de sesión.
		currentSession.close();

	}

	@Override
	@Transactional
	public void delete(EverisCustomer delCustomer) {

		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Apertura de transacción.
		// currentSession.getTransaction().begin();

		// Insercción.
		currentSession.delete(delCustomer);

		// Cierre de sesión.
		currentSession.close();
		

	}

	@Override
	@Transactional
	public EverisCustomer searchById(final Long id) {

		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Apertura de transacción.
		// currentSession.getTransaction().begin();

		// Búsqueda por PK.
		EverisCustomer result = currentSession.get(EverisCustomer.class, id);

		// Cierre de sesión.
		currentSession.close();

		return result;

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<EverisCustomer> searchAll() {

		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Apertura de transacción.
		// currentSession.getTransaction().begin();

		// Búsqueda de todos los registros.
		List<EverisCustomer> list = currentSession.createQuery("FROM EverisCustomer").list();

		// Cierre de sesión.
		currentSession.close();

		return list;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EverisCustomer> searchByCustomerFullName(String name, String surname1, String surname2) {

		// Obtención de sesión.
		Session currentSession = entityManager.unwrap(Session.class);

		// Localiza cliente por nombre completo.
		final List<EverisCustomer> customerList = currentSession
		        .createQuery("FROM EverisCustomer WHERE name='" + name + "' AND surname1='" + surname1 + "' AND surname2='" + surname2 + "'").list();

		return customerList;
	}

}
