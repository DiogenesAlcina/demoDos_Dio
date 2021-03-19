package com.everis.hibernate.model;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan("com.everis.hibernate.model")
public class CustomerModel {
	
	
	@Id
	private Long id;
	private String identityDocNumber;
	private String name;
	private String surName1;
	private String surname2;
	private Date updatedDate;
	private String updatedUser;
	
	public String getIdentityDocNumber() {
		return identityDocNumber;
	}
	public void setIdentityDocNumber(String identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName1() {
		return surName1;
	}
	public void setSurName1(String surName1) {
		this.surName1 = surName1;
	}
	public String getSurname2() {
		return surname2;
	}
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	

}
