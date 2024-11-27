package com.tms.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Setter
@Getter
@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Length(max = 50,message = "Message field is must be 50 characters!!")
	@NotBlank(message = "This field is required!")
	private String title;

	@NotBlank(message = "Sorry message is required!")
	@Column(length = 500)
	@Length(max = 500,message = "Message field is must be 500 characters!!")
	private String message;

	private LocalDate date;
}
