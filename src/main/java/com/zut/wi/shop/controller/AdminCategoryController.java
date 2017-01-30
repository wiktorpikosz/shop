package com.zut.wi.shop.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import com.zut.wi.shop.domain.Category;
import com.zut.wi.shop.service.CategoryService;

@Controller
public class AdminCategoryController {
	@Autowired
	private CategoryService categoryService;

	private static final Logger logger = LoggerFactory.getLogger(AdminCategoryController.class);

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping("/admin/category")
	public ModelAndView show() {
		return new ModelAndView("category_list", "categories", categoryService.showAll());
	}

	@RequestMapping("/admin/category/add")
	public ModelAndView add(@ModelAttribute("command") Category category) {
		Map<String, Object> model = new HashMap<String, Object>();

		model.put("categories", categoryService.showAll());

		return new ModelAndView("category_add", model);
	}

	@RequestMapping(value = "/admin/category/add", method = RequestMethod.POST)
	public ModelAndView addPost(@Valid @ModelAttribute("command") Category category, BindingResult bindingResult) {
		Map<String, Object> model = new HashMap<String, Object>();

		if (!bindingResult.hasErrors()) {
			categoryService.add(category);
			return new ModelAndView("redirect:/admin/category");
		}

		model.put("categories", categoryService.showAll());
		return new ModelAndView("category_add", model);
	}

}
