package com.zut.wi.shop.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zut.wi.shop.domain.Category;

@Repository
@Transactional
public class CategoryRepository extends AbstractRepository {

	public List<Category> findAll() {
		return (List<Category>) getCurrentSession().createCriteria(Category.class).list();
	}

	public Category save(Category category) {
		getCurrentSession().saveOrUpdate(category);

		return category;
	}
	
	public List<Category> findMain() {
		return (List<Category>) getCurrentSession()
				.createSQLQuery("SELECT * FROM category c"
						+ " WHERE c.subcategory_id IS NULL")
				.addEntity(Category.class)
				.list();
	}
}
