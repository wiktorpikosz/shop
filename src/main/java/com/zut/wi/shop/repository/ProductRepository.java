package com.zut.wi.shop.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zut.wi.shop.domain.Category;
import com.zut.wi.shop.domain.Product;

@Repository
@Transactional
public class ProductRepository extends AbstractRepository {

	public List<Product> findAll() {
		return (List<Product>) getCurrentSession().createCriteria(Product.class).list();
	}

	public Product save(Product product) {
		getCurrentSession().saveOrUpdate(product);

		return product;
	}
}
