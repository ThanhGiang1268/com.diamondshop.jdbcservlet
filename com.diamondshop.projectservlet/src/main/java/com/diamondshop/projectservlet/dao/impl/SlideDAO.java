package com.diamondshop.projectservlet.dao.impl;

import java.util.List;

import com.diamondshop.projectservlet.dao.ISlideDAO;
import com.diamondshop.projectservlet.mapper.SlideMapper;
import com.diamondshop.projectservlet.model.SlideModel;

public class SlideDAO extends AbstractDAO<SlideModel> implements ISlideDAO {

	@Override
	public List<SlideModel> findAll() {
		String sql = "SELECT * FROM slide";
		return query(sql, new SlideMapper());
	}

	
	
}
