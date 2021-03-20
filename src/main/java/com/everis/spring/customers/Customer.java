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
package com.everis.spring.customers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

//import com.everis.spring.model.Person;


@Entity
@Table(name = "customers")
public class Customer  {	
	/** SERIAL */
	//private static final Integer serialVersionUID = 1L;

	@Column(name = "id")
	/** Identificador (PK) */
	private Integer id;

	/** Nombre del cliente */
	//@Column(name = "nameCu")
	private String name;

	/** Primer apellido */
	//@Column(name = "surName1")
	private String surName1;

	/** Segundo apellido */
	//@Column(name = "surName2")
	private String surName2;

	/** Documento de identidad */
	//@Column(name = "identityDocNumber")
	private String identityDocNumber;

//	/**
//	 * @return the id
//	 */
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "nameCustomer", nullable = false)
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
	@Column(name = "surName1", nullable = false)
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
	@Column(name = "surName2", nullable = false)
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
	@Column(name = "identityDocNumber", nullable = false, unique = true)
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

	@Override
	public String toString() {

		return "Customer [id=" + id + ", name=" + name + ", surName1=" + surName1 + ", surName2=" + surName2 + ", identityDocNumber="
		        + identityDocNumber + "]";
	}
}
