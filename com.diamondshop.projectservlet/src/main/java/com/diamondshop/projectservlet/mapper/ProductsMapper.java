package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservlet.model.ProductsModel;

public class ProductsMapper implements IRowMapper<ProductsModel>{

	@Override
	public ProductsModel mapRow(ResultSet rs) {
		try {
			ProductsModel productsModel = new ProductsModel();
			productsModel.setIdCategory(rs.getLong("idcategory"));
			productsModel.setCategoryCode(rs.getString("categorycode"));
			productsModel.setSizes(rs.getString("sizes"));
			productsModel.setName(rs.getString("name"));
			productsModel.setPrice(rs.getDouble("price"));
			productsModel.setSale(rs.getInt("sale"));
			productsModel.setTitle(rs.getString("title"));
			productsModel.setHighLight(rs.getInt("highlight"));
			productsModel.setNewProduct(rs.getInt("newdroduct"));
			productsModel.setLongText(rs.getString("longtext"));
			return productsModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
