package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.ColorModel;

public class ColorMapper implements IRowMapper<ColorModel>{

	@Override
	public ColorModel mapRow(ResultSet result) {
		try {
			ColorModel colorModel = new ColorModel();
			colorModel.setCode(result.getString("code"));
			colorModel.setImg(result.getString("img"));
			return colorModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
