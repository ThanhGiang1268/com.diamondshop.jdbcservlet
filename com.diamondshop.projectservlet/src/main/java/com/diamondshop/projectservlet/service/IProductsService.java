package com.diamondshop.projectservlet.service;

import java.util.List;

import com.diamondshop.projectservlet.model.ProductsModel;

public interface IProductsService {
	List<ProductsModel> findAllProducts();
	ProductsModel findOne(Long id);
	List<ProductsModel> findAllProductByCategoryId(Long idCategory);
	List<ProductsModel> findAllByPrice(Double price);
	ProductsModel findByName(String name);
	List<ProductsModel> findAllBySize(String sizes);
}
