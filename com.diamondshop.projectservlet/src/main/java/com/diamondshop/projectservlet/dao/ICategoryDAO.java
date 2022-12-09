package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.CategoryModel;

public interface ICategoryDAO extends IGenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
}
