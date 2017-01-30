package com.zut.wi.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zut.wi.shop.domain.Category;
import com.zut.wi.shop.repository.CategoryRepository;

@Component
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> showAll(){
		return categoryRepository.findAll();
	}
	
	public Category add(Category category){
		return categoryRepository.save(category);
	}
	
	public List<Category> getMainCategory(){
		return categoryRepository.findMain();
	}
}
