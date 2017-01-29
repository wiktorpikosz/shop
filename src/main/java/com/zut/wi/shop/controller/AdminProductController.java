package com.zut.wi.shop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zut.wi.shop.domain.Product;
import com.zut.wi.shop.service.CategoryService;
import com.zut.wi.shop.service.ProductService;

@Controller
public class AdminProductController {
	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping(value = "/admin/product")
	public ModelAndView show() {
		return new ModelAndView("product_list", "products", productService.showAll());
	}

	@RequestMapping(value = "/admin/product/add")
	public ModelAndView add(@ModelAttribute("command") Product product) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("categories", categoryService.showAll());

		return new ModelAndView("product_add", model);
	}
	
	@RequestMapping(value = "/admin/product/add", method = RequestMethod.POST)
	public ModelAndView save(@Valid @ModelAttribute("command") Product product, BindingResult bindingResult) {
		Map<String, Object> model = new HashMap<String, Object>();
		
		if(!bindingResult.hasErrors()){
			productService.add(product);
			return new ModelAndView("redirect:/admin/product");
		}
		
		model.put("categories", categoryService.showAll());

		return new ModelAndView("product_add", model);
	}
}
