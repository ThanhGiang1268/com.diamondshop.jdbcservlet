package com.diamondshop.projectservlet.dao.impl;

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
	public CategoryModel fineOne(long id) {
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryModel> cml = query(sql, new CategoryMapper(), id);
		return cml.isEmpty() ? null : cml.get(0);
	}


	@Override
	public CategoryModel findOneByCode(String code) {
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryModel> cml = query(sql, new CategoryMapper(), code);
		return cml.isEmpty() ? null : cml.get(0);
	}
	
}
