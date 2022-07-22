package com.diamondshop.projectservlet.service1.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.ICategoryDAO;
import com.diamondshop.projectservlet.dao.IProductsDAO;
import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservlet.service.IProductsService;

public class ProductsService implements IProductsService {

	@Inject
	private IProductsDAO productsDAO;
	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<ProductsModel> findAllProducts() {
		return productsDAO.findAllProducts();
	}

	@Override
	public ProductsModel findOne(Long id) {
		ProductsModel productsModel = productsDAO.findOne(id);
		CategoryModel categoryModel = categoryDAO.findOne(productsModel.getIdCategory());
		productsModel.setCategoryCode(categoryModel.getCode());
		return productsModel;
	}

	@Override
	public List<ProductsModel> findAllProductByCategoryId(Long idCategory) {
		return productsDAO.findAllProductByCategoryId(idCategory);
	}

	@Override
	public List<ProductsModel> findAllByPrice(Double price) {
		return productsDAO.findAllByPrice(price);
	}

	@Override
	public ProductsModel findByName(String name) {

		return productsDAO.findByName(name);
	}

	@Override
	public List<ProductsModel> findAllBySize(String sizes) {

		return productsDAO.findAllBySize(sizes);
	}

}
