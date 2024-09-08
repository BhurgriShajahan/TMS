package com.tms.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 //Course name
 @NotBlank(message = "Course name is required!")
 @Size(max = 30, message = "Maximum 30 char!!")
 private String name;
 @NotBlank(message = "Description is required!")
 @Size(min = 20, max = 300, message = "Minimum 20 and maximum 200 char!!")
 private String description;


 @ManyToOne
 @JoinColumn(name = "teacher_id")
 private User teacher;
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private LocalDate startDate;
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private LocalDate endDate;

}
