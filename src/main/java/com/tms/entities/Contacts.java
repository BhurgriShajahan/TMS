package com.tms.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contacts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Length(max = 200)
	private String name;
	@Length(max = 200)
	private String surname;
	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Length(max = 200)
	private String email;
	@Length(max = 200)
	private String phone;
	private String image;
	@Length(max = 500)	
	private String about;
	@ManyToOne
	private User user;

	
}
