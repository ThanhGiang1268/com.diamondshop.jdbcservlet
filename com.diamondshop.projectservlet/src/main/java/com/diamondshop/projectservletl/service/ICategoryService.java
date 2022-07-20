package com.diamondshop.projectservletl.service;

import java.util.List;

import com.diamondshop.projectservlet.model.CategoryModel;

public interface ICategoryService {
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByName(String name);
}
