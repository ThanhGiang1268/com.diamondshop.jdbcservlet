package com.diamondshop.projectservlet.dao.impl;

import java.util.List;

import com.diamondshop.projectservlet.dao.IProductsDAO;
import com.diamondshop.projectservlet.mapper.ProductsMapper;
import com.diamondshop.projectservlet.model.ProductsModel;
import com.diamondshop.projectservlet.pageable.Pageable;

public class ProductDAO extends AbstractDAO<ProductsModel> implements IProductsDAO {

	
	@Override
	public List<ProductsModel> findAll(Pageable pageable) {
		String sql = "SELECT * FROM products";
		return query(sql, new ProductsMapper());

	}

	@Override
	public ProductsModel findOne(Long id) {
		String sql = "SELECT * FROM products WHERE id = ?";
		List<ProductsModel> prdml = query(sql, new ProductsMapper(), id);
		return prdml.isEmpty() ? null : prdml.get(0);
	}

	@Override
	public ProductsModel findByName(String name) {
		String sql = "SELECT * FROM products WHERE name = ?";
		List<ProductsModel> prdml = query(sql, new ProductsMapper(), name);
		return prdml.isEmpty() ? null : prdml.get(0);

	}

	@Override
	public List<ProductsModel> findAllByPrice(Double price) {
		String sql = "SELECT * FROM products WHERE price = ?";
		return query(sql, new ProductsMapper(), price);
	}

	@Override
	public List<ProductsModel> findAllBySize(String sizes) {
		String sql = "SELECT * FROM products WHERE sizes = ?";
		return query(sql, new ProductsMapper(), sizes);
	}

	@Override
	public List<ProductsModel> findByCategoryId(Long idCategory) {
		String sql = "SELECT * FROM products WHERE idcategory = ?";
		return query(sql, new ProductsMapper(), idCategory);
	}

	@Override
	public Long save(ProductsModel productsModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO products (title, name,");
		sql.append(" sizes, price, sale, createddate, createdby)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), productsModel.getTitle(), productsModel.getName(), productsModel.getSizes(),
				productsModel.getPrice(), productsModel.getSale(),
				productsModel.getSale(), productsModel.getCreatedDate(), productsModel.getCreatedBy());
	}

	@Override
	public void update(ProductsModel updateProducts) {
		StringBuilder sql = new StringBuilder("UPDATE products SET title = ?, name = ?,");
		sql.append(" sizes = ?, price = ?,");
		sql.append(" idcategory = ?, sale = ?,");
		sql.append("createddate = ?, createdby = ? WHERE id = ? ");
		update(sql.toString(),updateProducts.getTitle(),updateProducts.getId(),updateProducts.getName(),
				updateProducts.getSizes(),updateProducts.getPrice(),
				updateProducts.getSale(),updateProducts.getCreatedDate(),updateProducts.getCreatedBy());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM products WHERE id = ?";
		update(sql, id);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM products";
		return count(sql);
	}

	@Override
	public List<ProductsModel> findAll() {
		String sql = "SELECT * FROM products";
		return query(sql, new ProductsMapper());
	}



//	@Override
//	public List<ProductsModel> findOneProductsByManyColor(Long id) {
//		StringBuilder sql = new StringBuilder("SELECT * FROM products AS pr");
//		sql.append(" FULL OUTER JOIN color AS co ON pr.id = co.id");
//		sql.append(" WHERE ( SELECT  FROM color   = ?");
//		return query(sql.toString(), new ProductsMapper(), id);
//	}

}
