package com.everis.hibernate.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Formación Hibernate.
 * 
 * @author everis
 *
 */
@Entity
@Table(name = "ht_customer")
public class EverisCustomer implements Serializable {

	/** SERIAL */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long id;

	/** Nombre del cliente */
	private String name;

	/** Primer apellido */
	private String surName1;

	/** Segundo apellido */
	private String surName2;

	/** Documento de identidad */
	private String identityDocNumber;

	/** Auditoría | Usuario que actualiza */
	private String updatedUser;

	/** Auditoría | Día actualizado */
	private Date updatedDate;

	/**
	 * @return the idCustomer
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surName1
	 */
	@Column(name = "SURNAME1", nullable = false)
	public String getSurName1() {
		return surName1;
	}

	/**
	 * @param surName1
	 *            the surName1 to set
	 */
	public void setSurName1(String surName1) {
		this.surName1 = surName1;
	}

	/**
	 * @return the surName2
	 */
	@Column(name = "SURNAME2", nullable = true)
	public String getSurName2() {
		return surName2;
	}

	/**
	 * @param surName2
	 *            the surName2 to set
	 */
	public void setSurName2(String surName2) {
		this.surName2 = surName2;
	}

	/**
	 * @return the identityDocNumber
	 */
	@Column(name = "DOC_NUMBER", nullable = false, length = 9, unique = true)
	public String getIdentityDocNumber() {
		return identityDocNumber;
	}

	/**
	 * @param identityDocNumber
	 *            the identityDocNumber to set
	 */
	public void setIdentityDocNumber(String identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
	}

	/**
	 * @return the updatedUser
	 */
	@Column(name = "AUDIT_UPDATED_USER", nullable = false)
	public String getUpdatedUser() {
		return updatedUser;
	}

	/**
	 * @param updatedUser
	 *            the updatedUser to set
	 */
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	/**
	 * @return the updatedDate
	 */
	@Column(name = "AUDIT_UPDATED_DATE", nullable = false)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "EverisCustomer [id=" + id + ", name=" + name + ", surName1=" + surName1 + ", surName2=" + surName2 + ", identityDocNumber="
		        + identityDocNumber + ", updatedUser=" + updatedUser + ", updatedDate=" + updatedDate + "]";
	}

}
