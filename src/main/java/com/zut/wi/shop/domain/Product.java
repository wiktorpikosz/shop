package com.zut.wi.shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	@OneToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "name")
	@NotEmpty()
	private String name;

	@Column(name = "description")
	@NotEmpty()
	private String description;

	@Column(name = "manufacturer")
	@NotEmpty()
	private String manufacturer;

	@Column(name = "image")
	private String image;

	@Column(name = "price")
	@NotNull()
	private float price;

	@Column(name = "quantity")
	@NotNull()
	private Integer quantity;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
