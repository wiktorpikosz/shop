package com.zut.wi.shop.domian;

import org.hibernate.validator.constraints.NotEmpty;

public class Category {
	int id;
	
	@NotEmpty()
	String name;
	
	Category subcategory;
	
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
	public Category getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(Category subcategory) {
		this.subcategory = subcategory;
	}	
}
