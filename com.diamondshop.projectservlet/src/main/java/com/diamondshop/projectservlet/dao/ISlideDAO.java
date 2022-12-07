package com.diamondshop.projectservlet.dao;

import java.util.List;

import com.diamondshop.projectservlet.model.SlideModel;

public interface ISlideDAO extends IGenericDAO<SlideModel> {
	List<SlideModel> findAll();
}
