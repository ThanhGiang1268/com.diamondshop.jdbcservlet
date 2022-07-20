
package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.ProductsModel;

public interface IProductsDAO extends IGenericDAO<ProductsModel> {
	List<ProductsModel> findAllProducts();
	ProductsModel findOne(Long id);
	ProductsModel findOneByProduct(Long idCategory);
	ProductsModel findByPrice(Double price);
	ProductsModel findByName(String name);
	ProductsModel findBySize(String sizes);
}
