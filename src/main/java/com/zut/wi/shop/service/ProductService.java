package com.zut.wi.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zut.wi.shop.domain.Product;
import com.zut.wi.shop.repository.ProductRepository;

@Component
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> showAll(){
		return productRepository.findAll();
	}
	
	public Product add(Product product){
		return productRepository.save(product);
	}
}
