package com.diamondshop.projectservlet.model;

import java.util.Arrays;

public class ColorModel extends AbstractModel<ColorModel>{

	private String code;
	private String img;
	
	
	@Override
	public String toString() {
		return "ColorModel [code=" + code + ", img=" + img + ", getCode()=" + getCode() + ", getImg()=" + getImg()
				+ ", getId()=" + getId() + ", getCreatedDate()=" + getCreatedDate() + ", getModifiedDate()="
				+ getModifiedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getModifiedBy()=" + getModifiedBy()
				+ ", getIds()=" + Arrays.toString(getIds()) + ", getListResult()=" + getListResult() + ", getPage()="
				+ getPage() + ", getMaxPageItem()=" + getMaxPageItem() + ", getTotalPage()=" + getTotalPage()
				+ ", getTotalItem()=" + getTotalItem() + ", getSortName()=" + getSortName() + ", getSortBy()="
				+ getSortBy() + ", getAlert()=" + getAlert() + ", getMessage()=" + getMessage() + ", getType()="
				+ getType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
	
	
	
}
