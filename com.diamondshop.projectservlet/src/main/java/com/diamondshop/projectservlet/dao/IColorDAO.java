package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.ColorModel;

public interface IColorDAO extends IGenericDAO<ColorModel> {
		List<ColorModel> findByCode(String code);
		
}
