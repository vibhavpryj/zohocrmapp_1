package com.zohocrm_1.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LeadData")
public class Lead extends AbstractClass{
	@Column(name = "First_Name",nullable = false)
	public String firstName;
	@Column(name = "Last_Name",nullable = false)
	public String lastName;
	@Column(name = "email",nullable = false,unique = true)
	public String email;
	
	public long mobile;
	public String source;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
