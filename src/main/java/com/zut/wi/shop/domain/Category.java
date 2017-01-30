package com.zut.wi.shop.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Null;

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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subcategory_id")
	Category subcategory;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="subcategory_id")
	List<Category> subcategories;

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

	public List<Category> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}
}
