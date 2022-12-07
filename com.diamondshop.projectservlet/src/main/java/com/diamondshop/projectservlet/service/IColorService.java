package com.diamondshop.projectservlet.service;

import java.util.List;

import com.diamondshop.projectservlet.model.ColorModel;

public interface IColorService {
	List<ColorModel> findByCode(String code);
	
}
