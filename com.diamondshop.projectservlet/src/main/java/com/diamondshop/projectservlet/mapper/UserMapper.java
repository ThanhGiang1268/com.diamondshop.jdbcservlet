package com.diamondshop.projectservlet.mapper;

import java.sql.ResultSet;

import com.diamondshop.projectservlet.model.RoleModel;
import com.diamondshop.projectservlet.model.UserModel;

public class UserMapper implements IRowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet result) {
		try {
			UserModel user = new UserModel();
			user.setId(result.getLong("id"));
			user.setUserName(result.getString("username"));
			user.setFullName(result.getString("fullname"));
			user.setPassword(result.getString("password"));
			user.setStatus(result.getInt("status"));
			user.setRoleId(result.getLong("roleid"));
			try {
				RoleModel role = new RoleModel();
				role.setCode(result.getString("code"));
				role.setName(result.getString("name"));
				user.setRole(role);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return user;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

}
