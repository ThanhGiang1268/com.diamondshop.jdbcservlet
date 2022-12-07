package com.diamondshop.projectservlet.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservlet.model.UserModel;
import com.diamondshop.projectservlet.service.IProductsService;
import com.diamondshop.projectservlet.utils.HttpUtil;
import com.diamondshop.projectservlet.utils.SessionUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProductsService iproductsService;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ProductsModel productsModel = HttpUtil.of(request.getReader()).toModel(ProductsModel.class);
		productsModel.setCreatedBy(((UserModel)SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		productsModel = iproductsService.save(productsModel);
		mapper.writeValue(response.getOutputStream(), productsModel);
		
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ProductsModel updateProducts =  HttpUtil.of(request.getReader()).toModel(ProductsModel.class);
		updateProducts.setModifiedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		updateProducts = iproductsService.update(updateProducts);
		mapper.writeValue(response.getOutputStream(), updateProducts);
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		ProductsModel productsModel =  HttpUtil.of(request.getReader()).toModel(ProductsModel.class);
		iproductsService.delete(productsModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}

}
