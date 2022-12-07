package com.diamondshop.projectservlet.dao.impl;

import java.util.List;

import com.diamondshop.projectservlet.dao.IColorDAO;
import com.diamondshop.projectservlet.mapper.ColorMapper;
import com.diamondshop.projectservlet.model.ColorModel;

public class ColorDAO extends AbstractDAO<ColorModel> implements IColorDAO {

	@Override
	public List<ColorModel> findByCode(String code) {
		String sql = "SELECT * FROM color WHERE code = ?";
		return query(sql, new ColorMapper(), code);
	}

}
