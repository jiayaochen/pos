package com.freshandprestige.pos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String customerCode;
	
	public Customer() {}
	
	public Customer(Long id, String name, String email, String phone, String imageUrl, String customerCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.customerCode = customerCode;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tid: " + id + "\n\tname: " + name + "\n\temail: " + email + "\n\tphone: "
				+ phone + "\n\timageUrl: " + imageUrl + "\n\tcustomerCode: " + customerCode + "\n}\n";
	}
}
