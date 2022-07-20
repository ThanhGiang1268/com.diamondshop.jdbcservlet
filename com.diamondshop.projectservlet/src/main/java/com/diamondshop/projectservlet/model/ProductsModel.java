package com.diamondshop.projectservlet.model;

public class ProductsModel extends AbstractModel<ProductsModel> {
	private Long idCategory;
	private String categoryCode;
	private String sizes;
	private String name;
	private Double price;
	private int sale;
	private String title;
	private int highLight;
	private int newProduct;
	private String longText;
	
	
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHighLight() {
		return highLight;
	}
	public void setHighLight(int highLight) {
		this.highLight = highLight;
	}
	public int getNewProduct() {
		return newProduct;
	}
	public void setNewProduct(int newProduct) {
		this.newProduct = newProduct;
	}
	public String getLongText() {
		return longText;
	}
	public void setLongText(String longText) {
		this.longText = longText;
	}
	@Override
	public String toString() {
		return "ProductsModel [idCategory=" + idCategory + ", sizes=" + sizes + ", name=" + name + ", price=" + price
				+ ", sale=" + sale + ", title=" + title + ", highLight=" + highLight + ", newProduct=" + newProduct
				+ ", longText=" + longText + ", getIdCategory()=" + getIdCategory() + ", getSizes()=" + getSizes()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getSale()=" + getSale()
				+ ", getTitle()=" + getTitle() + ", getHighLight()=" + getHighLight() + ", getNewProduct()="
				+ getNewProduct() + ", getLongText()=" + getLongText() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
