package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.ProductsModel;

public class ProductsMapper implements IRowMapper<ProductsModel>{

	@Override
	public ProductsModel mapRow(ResultSet result) {
		try {
			ProductsModel productsModel = new ProductsModel();
			productsModel.setId(result.getLong("id"));
			productsModel.setCategoryCode(result.getString("categorycode"));
			productsModel.setSizes(result.getString("sizes"));
			productsModel.setName(result.getString("name"));
			productsModel.setPrice(result.getDouble("price"));
			productsModel.setSale(result.getInt("sale"));
			productsModel.setTitle(result.getString("title"));
			productsModel.setHighLight(result.getInt("highlight"));
			productsModel.setNewProduct(result.getInt("newdroduct"));
			productsModel.setLongText(result.getString("longtext"));
			productsModel.setIdColor(result.getLong("idcolor"));
			return productsModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
