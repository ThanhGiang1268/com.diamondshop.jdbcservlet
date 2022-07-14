package com.diamondshop.projectservlet.model;

public class ColorModel extends AbstractModel<ColorModel>{
	private Long idProduct;
	private String name;
	private String code;
	private String img;
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "ColorModel [idProduct=" + idProduct + ", name=" + name + ", code=" + code + ", img=" + img
				+ ", getIdProduct()=" + getIdProduct() + ", getName()=" + getName() + ", getCode()=" + getCode()
				+ ", getImg()=" + getImg() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
