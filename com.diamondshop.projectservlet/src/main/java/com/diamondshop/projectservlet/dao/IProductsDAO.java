
package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.ProductsModel;

public interface IProductsDAO extends IGenericDAO<ProductsModel> {
	List<ProductsModel> findAllProducts();
	ProductsModel findOne(Long id);
	List<ProductsModel> findAllProductByCategoryId(Long idCategory);
	List<ProductsModel> findAllByPrice(Double price);
	ProductsModel findByName(String name);
	List<ProductsModel> findAllBySize(String sizes);
}
