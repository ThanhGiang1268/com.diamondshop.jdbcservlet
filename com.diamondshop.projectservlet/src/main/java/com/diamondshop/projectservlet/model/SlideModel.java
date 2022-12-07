package com.diamondshop.projectservlet.model;

public class SlideModel extends AbstractModel<SlideModel> {
	private String pic;
	private String caption;
	private String content;
	
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
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
}
