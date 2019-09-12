package com.macro.mall.dto;

public class Banner {
	private String id;
	private String name;
	private String pic;
	private String status;
	private String url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getPic() {
		return pic;
	}
	public String getStatus() {
		return status;
	}
	public String getUrl() {
		return url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
