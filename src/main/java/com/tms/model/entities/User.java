package com.tms.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// User name
	@NotBlank(message = "Name is required!")
	@Size(min = 3, max = 30, message = "Minimum 3 and maximum 30 char!!")
	private String name;

	// father name
	@NotBlank(message = "father name is required!")
	@Size(min = 3, max = 30, message = "Minimum 3 and maximum 30 char!!")
	private String fname;

	// User Surname
	@NotBlank(message = "Surname is required!")
	@Size(min = 3, max = 30, message = "Minimum 3 and maximum 30 char!!")
	private String surname;

	// User gender
	@NotBlank(message = "Gender is required!")
	private String gender;

	// User age
	@NotBlank(message = "Age is required!")
	private String age;

	// User country name
	@NotBlank(message = "Country is required!")
	private String country;

	// User City name
	@NotBlank(message = "City is required!")
	private String city;

	// User Address
	@NotBlank(message = "Address is required!")
	@Column(length = 500)
	private String address;

	// Standard -- Class name
	@NotBlank(message = "Class is required!")
	private String standerd;

	// Going to
	@NotBlank(message = "Going to is required!")
	private String going;

	// Subject
	@NotBlank(message = "Subject is required!")
	private String subject;

	// Phone number
	@NotBlank(message = "Phone number is required!")
	private String phone;

	// Tuition type
	@NotBlank(message = "Tuition type is required!")
	private String tuitionType;

	// Tutor preferred
	@NotBlank(message = "Tutor Preferred is required!")
	private String tutorPreferred;

	// Email
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Must match exampl4@gmail.com")
	@Column(unique = true)
	private String email;

	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Min size 8 and use char,number and symbols")
	private String password;

	@NotBlank(message = "Marital status is required!")
	private String marital;

	@NotBlank(message = "Qualification is required!")
	private String qualification;

	@NotBlank(message = "Degree is required!")
	private String degree;

	@NotBlank(message = "Experience is required!")
	private String experience;

	// User role
	private String role;

	// User account
	private boolean active;

	// User image
	private String image;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Contacts> contact = new ArrayList<>();

	// User.java
	@OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL)
	private List<Message> receivedMessages = new ArrayList<>();


}
