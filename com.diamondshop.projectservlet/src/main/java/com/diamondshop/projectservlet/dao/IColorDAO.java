package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.ColorModel;

public interface IColorDAO extends IGenericDAO<ColorModel> {
		ColorModel findOne(Long id);
		List<ColorModel> findByColorProduct(Long idProduct);
		
}
