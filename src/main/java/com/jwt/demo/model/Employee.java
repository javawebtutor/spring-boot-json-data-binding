package com.jwt.demo.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

public class Employee {

	private Long id;
	private String name;
	private String email;
	private Long phone;
	private int age;
	private BigDecimal salary;
	private String designation;
	private String[] projects;
	
	private Address address;
	
	private String[] bankAccount;
	private Map<String, String> personalInformation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String[] getProjects() {
		return projects;
	}

	public void setProjects(String[] projects) {
		this.projects = projects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String[] bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}

	public Map<String, String> getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(Map<String, String> personalInformation) {
		this.personalInformation = personalInformation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ ", salary=" + salary + ", projects=" + Arrays.toString(projects) + ", address=" + address
				+ ", bankAccount=" + Arrays.toString(bankAccount) + ", personalInformation=" + personalInformation
				+ "]";
	}

}
