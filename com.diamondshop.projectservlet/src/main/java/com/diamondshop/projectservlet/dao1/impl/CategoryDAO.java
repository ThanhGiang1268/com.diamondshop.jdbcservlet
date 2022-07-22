package com.diamondshop.projectservlet.dao1.impl;

import java.util.List;

import com.diamondshop.projectservlet.dao.ICategoryDAO;
import com.diamondshop.projectservlet.mapper.CategoryMapper;
import com.diamondshop.projectservlet.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryModel> cml = query(sql, new CategoryMapper(), id);
		return cml.isEmpty() ? null : cml.get(0);
	}

	@Override
	public CategoryModel findOneByName(String name) {
		String sql = "SELECT * FROM category WHERE name = ?";
		List<CategoryModel> cml = query(sql, new CategoryMapper(), name);
		return cml.isEmpty() ? null : cml.get(0);
	}
	
}
