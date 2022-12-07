package com.diamondshop.projectservlet.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.IColorDAO;
import com.diamondshop.projectservlet.model.ColorModel;
import com.diamondshop.projectservlet.service.IColorService;

public class ColorService implements IColorService {
	
	@Inject 
	private IColorDAO icolorDAO;
	
	@Override
	public List<ColorModel> findByCode(String code) {
		
		return icolorDAO.findByCode(code);
	}
	
	
}
