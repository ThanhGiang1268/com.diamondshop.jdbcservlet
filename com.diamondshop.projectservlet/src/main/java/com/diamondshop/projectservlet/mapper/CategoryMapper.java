package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.CategoryModel;

public class CategoryMapper implements IRowMapper<CategoryModel>{

	@Override
	public CategoryModel mapRow(ResultSet result) {
		try {
			CategoryModel category = new CategoryModel();
			category.setId(result.getLong("id"));
			category.setCode(result.getString("code"));
			category.setName(result.getString("name"));
			category.setDescription(result.getString("description"));
			category.setIdproducts(result.getLong("idproducts"));
			return category;
		} catch (SQLException e) {
			return null;
		}
	
	}

}
