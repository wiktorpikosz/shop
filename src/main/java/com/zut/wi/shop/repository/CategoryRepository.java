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
public class CategoryRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getCurrentSession() {
		Session session;

		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		return session;
	}

	public List<Category> findAll() {
		return ( List<Category>) getCurrentSession().createCriteria(Category.class).list();
	}

	public Category save(Category category) {
		getCurrentSession().saveOrUpdate(category);

		return category;
	}
}
