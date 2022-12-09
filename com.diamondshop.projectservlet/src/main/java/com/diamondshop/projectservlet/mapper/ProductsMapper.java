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
			productsModel.setId_category(result.getInt("id_category"));
			productsModel.setSizes(result.getString("sizes"));
			productsModel.setName(result.getString("name"));
			productsModel.setPrice(result.getDouble("price"));
			productsModel.setSale(result.getInt("sale"));
			productsModel.setTitle(result.getString("title"));
			productsModel.setHighlight(result.getBoolean("highlight"));
			productsModel.setNewProduct(result.getBoolean("newProduct"));
			productsModel.setDetails(result.getString("details"));
			return productsModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
