package com.zut.wi.shop.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zut.wi.shop.service.CategoryService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PageController {

	private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@Autowired
	private CategoryService categoryService;

	public void setServiceCategory(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories", categoryService.getMainCategory());
		
		return new ModelAndView("home", model);
	}

}
