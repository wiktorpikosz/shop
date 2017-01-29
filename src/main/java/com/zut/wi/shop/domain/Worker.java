package com.zut.wi.shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "worker")
public class Worker extends Person {

	@Id
	@Column(name = "workerId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int workerId;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@Column(name = "roles")
	private String roles;

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}
