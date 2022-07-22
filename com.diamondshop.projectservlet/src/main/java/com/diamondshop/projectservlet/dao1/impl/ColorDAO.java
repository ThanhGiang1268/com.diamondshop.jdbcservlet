package com.diamondshop.projectservlet.dao1.impl;

import java.util.List;

import com.diamondshop.projectservlet.dao.IColorDAO;

import com.diamondshop.projectservlet.mapper.ColorMapper;

import com.diamondshop.projectservlet.model.ColorModel;

public class ColorDAO extends AbstractDAO<ColorModel> implements IColorDAO {

	@Override
	public ColorModel findOne(Long id) {
		String sql = "SELECT * FROM color WHERE id = ?";
		List<ColorModel> colorMl = query(sql, new ColorMapper(), id);

		return colorMl.isEmpty() ? null : colorMl.get(0);

	}

	@Override
	public List<ColorModel> findByColorProduct(Long idProduct) {
		String sql = "SELECT * FROM color WHERE idproduct = ?";
		return query(sql, new ColorMapper(), idProduct);
	}

}
