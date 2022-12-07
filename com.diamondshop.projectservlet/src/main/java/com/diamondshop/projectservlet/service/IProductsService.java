package com.diamondshop.projectservlet.service;

import java.util.List;

import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservlet.pageable.Pageable;

public interface IProductsService {
	List<ProductsModel> findAll(Pageable pageable);
	List<ProductsModel> findByCategoryId(Long idCategory);
	List<ProductsModel> findAllByPrice(Double price);
	List<ProductsModel> findAllBySize(String sizes);
	List<ProductsModel> findAllProductsByOneColor(Long idColor); 
	ProductsModel findByName(String name);
	ProductsModel findOne(Long id);
	ProductsModel save(ProductsModel productsModel);
	ProductsModel update(ProductsModel updateProducts);
	void delete(long[] ids);
	int getTotalItem();
}
