
package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservlet.pageable.Pageable;


public interface IProductsDAO extends IGenericDAO<ProductsModel> {
	List<ProductsModel> findAll();
	List<ProductsModel> findAll(Pageable pageable);
	List<ProductsModel> findByCategoryId(Long idCategory);
	List<ProductsModel> findAllByPrice(Double price);
	List<ProductsModel> findAllBySize(String sizes);
	//List<ProductsModel> findOneProductsByManyColor(Long id); 
	ProductsModel findByName(String name);
	ProductsModel findOne(Long id);
	Long save(ProductsModel productsModel);
	void update(ProductsModel updateProducts);
	void delete(long id);
	int getTotalItem();
}
