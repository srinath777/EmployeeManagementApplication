package com.employee.app.domain;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity 
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_ID")
	private Integer id;
	@NotBlank(message = "Name is mandatory")
	@Column(name = "Employee_Name")
	private String EmpName;
	
	@Email(message = "Invalid email format")
	@NotBlank(message = "Email is mandatory")
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Role")
	private String role;

	public Employee() {
	}

	public Employee(Integer id,String empName,String email,String role) {
		super();
		this.id=id;
		EmpName = empName;
		this.email = email;
		this.role = role;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
	
	
}


