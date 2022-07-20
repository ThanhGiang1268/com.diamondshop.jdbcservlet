package com.diamondshop.projectservletl.service;

import java.util.List;

import com.diamondshop.projectservlet.model.ColorModel;

public interface IColorService {
	ColorModel findOne(Long id);
	List<ColorModel> findByColorProduct(Long idProduct);
	
}
