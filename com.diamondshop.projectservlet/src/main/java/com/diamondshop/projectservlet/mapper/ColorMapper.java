package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.CategoryModel;
import com.diamondshop.projectservlet.model.ColorModel;

public class ColorMapper implements IRowMapper<ColorModel>{

	@Override
	public ColorModel mapRow(ResultSet rs) {
		try {
			ColorModel colorModel = new ColorModel();
			colorModel.setIdProduct(rs.getLong("idproduct"));
			colorModel.setCode(rs.getString("code"));
			colorModel.setName(rs.getString("name"));
			colorModel.setImg(rs.getString("img"));
			return colorModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
