package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String username;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private Integer mobileno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMobileno() {
		return mobileno;
	}
	public void setMobileno(Integer mobileno) {
		this.mobileno = mobileno;
	}
	public Registration(Integer id, String username, String fname, String lname, String email, String address,
			Integer mobileno) {
		super();
		this.id = id;
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.mobileno = mobileno;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
