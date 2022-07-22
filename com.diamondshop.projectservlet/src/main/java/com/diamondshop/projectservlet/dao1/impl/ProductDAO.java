package com.diamondshop.projectservlet.dao1.impl;

import java.util.List;

import com.diamondshop.projectservlet.dao.IProductsDAO;
import com.diamondshop.projectservlet.mapper.ColorMapper;
import com.diamondshop.projectservlet.mapper.ProductsMapper;
import com.diamondshop.projectservlet.model.ColorModel;
import com.diamondshop.projectservlet.model.ProductsModel;

public class ProductDAO extends AbstractDAO<ProductsModel> implements IProductsDAO{

	@Override
	public List<ProductsModel> findAllProducts() {
		String sql = "SELECT * FROM products";
		return query(sql, new ProductsMapper());

	}

	@Override
	public ProductsModel findOne(Long id) {
		String sql = "SELECT * FROM products WHERE id = ?";
		List<ProductsModel> prdml = query(sql, new ProductsMapper(), id);
		return prdml.isEmpty() ? null : prdml.get(0);
	}



	@Override
	public ProductsModel findByName(String name) {
		String sql = "SELECT * FROM products WHERE name = ?";
		List<ProductsModel> prdml = query(sql, new ProductsMapper(), name);
		return prdml.isEmpty() ? null : prdml.get(0);

	}



	@Override
	public List<ProductsModel> findAllByPrice(Double price) {
		String sql = "SELECT * FROM products WHERE price = ?";
		return query(sql, new ProductsMapper(), price);
	}

	@Override
	public List<ProductsModel> findAllBySize(String sizes) {
		String sql = "SELECT * FROM products WHERE sizes = ?";
		return query(sql, new ProductsMapper(), sizes);
	}

	@Override
	public List<ProductsModel> findAllProductByCategoryId(Long idCategory) {
		String sql = "SELECT * FROM products WHERE idcategory = ?";
		return query(sql, new ProductsMapper(), idCategory);
	}

}
