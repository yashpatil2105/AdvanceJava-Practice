package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Employee extends BaseEntity {
    
	@Column(name = "first_name",length = 30)
	private String firstName;
	@Column(name = "last_name",length = 30)
	private String lastName;
	@Column(length = 30)
	private String department;
	@Column(length = 30, unique = true)
	private String email;
	@Column(length = 100, nullable = false)
	private String password;
	private LocalDate joiningDate;

}
