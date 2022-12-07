package com.diamondshop.projectservlet.model;

import java.util.Arrays;

public class ProductsModel extends AbstractModel<ProductsModel> {
	
	private String categoryCode;
	private String sizes;
	private String name;
	private Double price;
	private int sale;
	private String title;
	private int highLight;
	private int newProduct;
	private String longText;
	private ColorModel color = new ColorModel();
	private Long idColor;
	private String description;
	
	
	@Override
	public String toString() {
		return "ProductsModel [categoryCode=" + categoryCode + ", sizes=" + sizes + ", name=" + name + ", price="
				+ price + ", sale=" + sale + ", title=" + title + ", highLight=" + highLight + ", newProduct="
				+ newProduct + ", longText=" + longText + ", color=" + color + ", idColor=" + idColor + ", description="
				+ description + ", getDescription()=" + getDescription() + ", getCategoryCode()=" + getCategoryCode()
				+ ", getSizes()=" + getSizes() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getSale()=" + getSale() + ", getTitle()=" + getTitle() + ", getHighLight()=" + getHighLight()
				+ ", getNewProduct()=" + getNewProduct() + ", getLongText()=" + getLongText() + ", getColor()="
				+ getColor() + ", getIdColor()=" + getIdColor() + ", getId()=" + getId() + ", getCreatedDate()="
				+ getCreatedDate() + ", getModifiedDate()=" + getModifiedDate() + ", getCreatedBy()=" + getCreatedBy()
				+ ", getModifiedBy()=" + getModifiedBy() + ", getIds()=" + Arrays.toString(getIds())
				+ ", getListResult()=" + getListResult() + ", getPage()=" + getPage() + ", getMaxPageItem()="
				+ getMaxPageItem() + ", getTotalPage()=" + getTotalPage() + ", getTotalItem()=" + getTotalItem()
				+ ", getSortName()=" + getSortName() + ", getSortBy()=" + getSortBy() + ", getAlert()=" + getAlert()
				+ ", getMessage()=" + getMessage() + ", getType()=" + getType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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

	public ColorModel getColor() {
		return color;
	}
	public void setColor(ColorModel color) {
		this.color = color;
	}
	public Long getIdColor() {
		return idColor;
	}
	public void setIdColor(Long idColor) {
		this.idColor = idColor;
	}
	
	
}
