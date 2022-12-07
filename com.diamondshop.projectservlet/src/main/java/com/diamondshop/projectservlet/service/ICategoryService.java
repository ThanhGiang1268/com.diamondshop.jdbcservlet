package com.diamondshop.projectservlet.service;

import java.util.List;

import com.diamondshop.projectservlet.model.CategoryModel;

public interface ICategoryService {
	List<CategoryModel> findAll();
}
