package com.diamondshop.projectservlet.service;

import com.diamondshop.projectservlet.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
