package com.pace.wisdom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_tbl")
public class Employee {
	@Id
	@GeneratedValue

	private Integer id;
	private String firstname;
	private String lastname;
	private String emailid;
	private String age;
	private String gender;
	private String address;

	public Employee() {
	}

	public Employee(Integer id, String firstname, String secondname, String emailid, String age, String gender,
			String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = secondname;
		this.emailid = emailid;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String secondname) {
		this.lastname = secondname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

}
