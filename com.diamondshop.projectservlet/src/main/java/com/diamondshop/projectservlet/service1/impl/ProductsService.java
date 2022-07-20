package com.diamondshop.projectservlet.service1.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.ICategoryDAO;
import com.diamondshop.projectservlet.dao.IProductsDAO;
import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservletl.service.IProductsService;

public class ProductsService implements IProductsService{
	
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
	public ProductsModel findOneByProduct(Long idCategory) {
		
		return productsDAO.findOneByProduct(idCategory);
	}

	@Override
	public ProductsModel findByPrice(Double price) {
		
		return productsDAO.findByPrice(price);
	}

	@Override
	public ProductsModel findByName(String name) {
		
		return productsDAO.findByName(name);
	}

	@Override
	public ProductsModel findBySize(String sizes) {
		
		return productsDAO.findBySize(sizes);
	}
	
}
