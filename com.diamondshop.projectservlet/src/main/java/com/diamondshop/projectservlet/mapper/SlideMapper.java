package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.diamondshop.projectservlet.model.SlideModel;

public class SlideMapper implements IRowMapper<SlideModel> {

	@Override
	public SlideModel mapRow(ResultSet result) {
		try {
			SlideModel slideModel = new SlideModel();
			slideModel.setId(result.getLong("id"));
			slideModel.setCaption(result.getString("caption"));
			slideModel.setContent(result.getString("content"));
			slideModel.setPic(result.getString("pic"));
			return slideModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
