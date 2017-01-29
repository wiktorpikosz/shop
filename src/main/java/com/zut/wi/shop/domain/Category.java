package com.zut.wi.shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column(name = "categoryId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int categoryId;

	
	@Column(name = "name")
	@NotEmpty()
	String name;

	@OneToOne
	@JoinColumn(name = "subcategory_id")
	Category subcategory;


	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
