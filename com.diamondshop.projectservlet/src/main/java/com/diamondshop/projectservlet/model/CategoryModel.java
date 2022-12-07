package com.diamondshop.projectservlet.model;

import java.util.Arrays;

public class CategoryModel extends AbstractModel<CategoryModel> {
	private String name;
	private String description;
	private String code;
	private Long idproducts;
	
	
	public Long getIdproducts() {
		return idproducts;
	}
	public void setIdproducts(Long idproducts) {
		this.idproducts = idproducts;
	}
	public String getCode() {
		return code;	
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "CategoryModel [name=" + name + ", description=" + description + ", code=" + code + ", idproducts="
				+ idproducts + ", getIdproducts()=" + getIdproducts() + ", getCode()=" + getCode() + ", getName()="
				+ getName() + ", getDescription()=" + getDescription() + ", getId()=" + getId() + ", getCreatedDate()="
				+ getCreatedDate() + ", getModifiedDate()=" + getModifiedDate() + ", getCreatedBy()=" + getCreatedBy()
				+ ", getModifiedBy()=" + getModifiedBy() + ", getIds()=" + Arrays.toString(getIds())
				+ ", getListResult()=" + getListResult() + ", getPage()=" + getPage() + ", getMaxPageItem()="
				+ getMaxPageItem() + ", getTotalPage()=" + getTotalPage() + ", getTotalItem()=" + getTotalItem()
				+ ", getSortName()=" + getSortName() + ", getSortBy()=" + getSortBy() + ", getAlert()=" + getAlert()
				+ ", getMessage()=" + getMessage() + ", getType()=" + getType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
