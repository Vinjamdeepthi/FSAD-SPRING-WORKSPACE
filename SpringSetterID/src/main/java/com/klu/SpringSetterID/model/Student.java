package com.klu.SpringSetterID.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void display() {
		System.out.println(id+""+name);
		System.out.println("Student lives in "+ address.getCity());
		System.out.println("Student Department is "+department.getDepartment());
	}
	

}
