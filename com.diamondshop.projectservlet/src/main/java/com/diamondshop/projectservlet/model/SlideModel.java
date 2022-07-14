package com.diamondshop.projectservlet.model;

public class SlideModel extends AbstractModel<SlideModel> {
	private String img;
	private String caption;
	private String content;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "SlideModel [img=" + img + ", caption=" + caption + ", content=" + content + ", getImg()=" + getImg()
				+ ", getCaption()=" + getCaption() + ", getContent()=" + getContent() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
