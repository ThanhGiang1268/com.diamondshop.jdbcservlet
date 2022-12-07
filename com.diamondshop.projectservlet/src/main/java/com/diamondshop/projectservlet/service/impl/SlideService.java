package com.diamondshop.projectservlet.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.ISlideDAO;
import com.diamondshop.projectservlet.model.SlideModel;
import com.diamondshop.projectservlet.service.ISlideService;

public class SlideService implements ISlideService{
	
	@Inject
	private ISlideDAO islideDAO;
	
	@Override
	public List<SlideModel> findAll() {
	
		return islideDAO.findAll();
	}

}
