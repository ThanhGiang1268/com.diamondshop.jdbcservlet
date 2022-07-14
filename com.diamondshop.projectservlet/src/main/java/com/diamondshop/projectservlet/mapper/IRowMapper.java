package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;

public interface IRowMapper<T> {
	T mapRow(ResultSet rs);
}
