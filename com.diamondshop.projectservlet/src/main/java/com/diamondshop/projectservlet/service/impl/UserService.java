package com.diamondshop.projectservlet.service.impl;

import javax.inject.Inject;

import com.diamondshop.projectservlet.dao.IUserDAO;
import com.diamondshop.projectservlet.model.UserModel;
import com.diamondshop.projectservlet.service.IUserService;

public class UserService implements IUserService {
	@Inject
	private IUserDAO iuserDAO;

//	public UserService() {
//		iuserDAO = new UserDAO();
//	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return iuserDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}
	
}
