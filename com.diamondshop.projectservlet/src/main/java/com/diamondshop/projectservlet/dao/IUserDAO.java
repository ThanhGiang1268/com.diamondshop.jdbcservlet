package com.diamondshop.projectservlet.dao;

import com.diamondshop.projectservlet.model.UserModel;

public interface IUserDAO extends IGenericDAO<UserModel> {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
