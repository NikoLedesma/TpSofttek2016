package com.grupo3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "patient")
public class Patient {
	
	@Id
	@Column(name = "patient_id")
	@GeneratedValue( strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "patient_firstName")
	private String firstName;
	
	@Column(name = "patient_lastName")
	private String lastName;

	
	/*Accessors*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
