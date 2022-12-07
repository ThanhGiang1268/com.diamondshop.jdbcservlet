package com.diamondshop.projectservlet.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.ICategoryDAO;
import com.diamondshop.projectservlet.dao.IProductsDAO;
import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservlet.pageable.Pageable;
import com.diamondshop.projectservlet.service.IProductsService;

public class ProductsService implements IProductsService {

	@Inject
	private IProductsDAO iproductsDAO;
	@Inject
	private ICategoryDAO icategoryDAO;

	@Override
	public List<ProductsModel> findAll(Pageable pageable) {
		return iproductsDAO.findAll(pageable);
	}

	@Override
	public ProductsModel findOne(Long id) {
		ProductsModel productsModel = iproductsDAO.findOne(id);
		CategoryModel categoryModel = icategoryDAO.findOneByCode(productsModel.getCategoryCode());
		productsModel.setCategoryCode(categoryModel.getCode());
		return productsModel;
	}

	@Override
	public List<ProductsModel> findByCategoryId(Long idCategory) {
		return iproductsDAO.findByCategoryId(idCategory);
	}

	@Override
	public List<ProductsModel> findAllByPrice(Double price) {
		return iproductsDAO.findAllByPrice(price);
	}

	@Override
	public ProductsModel findByName(String name) {

		return iproductsDAO.findByName(name);
	}

	@Override
	public List<ProductsModel> findAllBySize(String sizes) {

		return iproductsDAO.findAllBySize(sizes);
	}

	@Override
	public ProductsModel save(ProductsModel productsModel) {
		//productsModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		productsModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		CategoryModel category = icategoryDAO.findOneByCode(productsModel.getCategoryCode());	 /* findOne(productsModel.getCategoryCode()); */
		productsModel.setCategoryCode(category.getCode());  
		Long newCode = iproductsDAO.save(productsModel);
		return iproductsDAO.findOne(newCode);
	}

	@Override
	public ProductsModel update(ProductsModel updateProducts) {
		// NewModel oldNew = newDao.findOne(updateNew.getId());
		ProductsModel oldProducts = iproductsDAO.findOne(updateProducts.getId());
		updateProducts.setCreatedDate(oldProducts.getCreatedDate());
		updateProducts.setCreatedBy(oldProducts.getCreatedBy());
		updateProducts.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		CategoryModel category = icategoryDAO.findOneByCode(updateProducts.getCategoryCode());
		updateProducts.setId(category.getId());
		iproductsDAO.update(updateProducts);
		return iproductsDAO.findOne(updateProducts.getId());
	}

	@Override
	public void delete(long[] ids) {
		for(long id : ids) {
			iproductsDAO.delete(id);
		}
		
	}

	@Override
	public int getTotalItem() {
		return iproductsDAO.getTotalItem();
	}

	@Override
	public List<ProductsModel> findAllProductsByOneColor(Long idColor) {
		
		return iproductsDAO.findAllProductsByOneColor(idColor);
	}

}
