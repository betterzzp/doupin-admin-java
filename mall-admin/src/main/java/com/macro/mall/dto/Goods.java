package com.macro.mall.dto;

import java.math.BigDecimal;

public class Goods {
	private String id;
	private String pic;
	private String name;
	private String url;
	private String status;
	private String descption;
	private BigDecimal price;
	private BigDecimal promotionprice ;
	private String tag;
	public BigDecimal getPrice() {
		return price;
	}
	public BigDecimal getPromotionprice() {
		return promotionprice;
	}
	public String getTag() {
		return tag;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setPromotionprice(BigDecimal promotionprice) {
		this.promotionprice = promotionprice;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getDescption() {
		return descption;
	}
	public void setDescption(String descption) {
		this.descption = descption;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public String getPic() {
		return pic;
	}
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
