package com.macro.mall.dto;

import java.math.BigDecimal;
import java.util.List;

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
	private String banner;
	private String isbanner;
	private String bigpic;
	public String getBigpic() {
		return bigpic;
	}
	public void setBigpic(String bigpic) {
		this.bigpic = bigpic;
	}
	private List<GoodDetail> goodDetail;
	private List<GoodParam> goodParam;
	private List<GoodMeasurement> goodsMeasurement;
	
	public List<GoodDetail> getGoodDetail() {
		return goodDetail;
	}
	public List<GoodParam> getGoodParam() {
		return goodParam;
	}
	public List<GoodMeasurement> getGoodsMeasurement() {
		return goodsMeasurement;
	}
	public void setGoodDetail(List<GoodDetail> goodDetail) {
		this.goodDetail = goodDetail;
	}
	public void setGoodParam(List<GoodParam> goodParam) {
		this.goodParam = goodParam;
	}
	public void setGoodsMeasurement(List<GoodMeasurement> goodsMeasurement) {
		this.goodsMeasurement = goodsMeasurement;
	}
	public String getBanner() {
		return banner;
	}
	public String getIsbanner() {
		return isbanner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public void setIsbanner(String isbanner) {
		this.isbanner = isbanner;
	}
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
