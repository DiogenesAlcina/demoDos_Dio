package com.everis.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.everis.spring.customers.Customer;

/**
 * Formación Spring.
 * 
 * @author Everis
 *
 */
@Repository
public interface EverisCustomerRepository extends JpaRepository<Customer, Long> {

	/**
	 * Obtención del cliente mediante el nombre.
	 * Todos los clientes con el nombre que le pasemos.
	 * 
	 * @param name
	 * @return List<Customert>
	 */
	@Query(value="SELECT * FROM empleados WHERE nombre=?1", nativeQuery = true)
	public List<Customer> buscarPorNombre(final String name);

	/**
	 * Obtención del cliente mediante el nombre completo.
	 * 
	 * @param name
	 * @return List<EverisClient>
	 */
	public List<Customer> findByNameAndSurName1AndSurName2(final String name, final String surname1, final String surname2);

}
