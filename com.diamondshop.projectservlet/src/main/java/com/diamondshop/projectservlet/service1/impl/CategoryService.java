package com.diamondshop.projectservlet.service1.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.ICategoryDAO;
import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservletl.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDAO.findAll();
	}

	@Override
	public CategoryModel findOne(long id) {
		
		return categoryDAO.findOne(id);
	}

	@Override
	public CategoryModel findOneByName(String name) {
		
		return categoryDAO.findOneByName(name);
	}

}
