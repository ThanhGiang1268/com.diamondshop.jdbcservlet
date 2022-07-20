package com.diamondshop.projectservlet.service1.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.IColorDAO;
import com.diamondshop.projectservlet.dao.IProductsDAO;
import com.diamondshop.projectservlet.model.ColorModel;
import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservletl.service.IColorService;

public class ColorService implements IColorService {
	
	@Inject 
	private IColorDAO colorDAO;
	@Inject
	private IProductsDAO productsDAO;
	
	@Override
	public ColorModel findOne(Long id) {
		ColorModel colorModel = colorDAO.findOne(id);
		ProductsModel productsModel = productsDAO.findOne(colorModel.getIdProduct());
		productsModel.setName(colorModel.getName());
		
		return colorModel;
		
	}

	@Override
	public List<ColorModel> findByColorProduct(Long idProduct) {
		
		return colorDAO.findByColorProduct(idProduct);
	}

}
