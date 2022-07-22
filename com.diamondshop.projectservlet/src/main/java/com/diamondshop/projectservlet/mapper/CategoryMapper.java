package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.CategoryModel;

public class CategoryMapper implements IRowMapper<CategoryModel>{

	@Override
	public CategoryModel mapRow(ResultSet rs) {
		try {
			CategoryModel category = new CategoryModel();
			category.setId(rs.getLong("id"));
			category.setCode(rs.getString("code"));
			category.setName(rs.getString("name"));
			category.setDescription(rs.getString("description"));
			return category;
		} catch (SQLException e) {
			return null;
		}
	
	}

}
