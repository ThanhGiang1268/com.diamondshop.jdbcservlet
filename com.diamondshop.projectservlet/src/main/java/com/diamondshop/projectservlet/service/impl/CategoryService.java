package com.diamondshop.projectservlet.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.ICategoryDAO;
import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservlet.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO icategoryDAO;
	
	@Override
	public List<CategoryModel> findAll() {
		
		return icategoryDAO.findAll();
	}
}
