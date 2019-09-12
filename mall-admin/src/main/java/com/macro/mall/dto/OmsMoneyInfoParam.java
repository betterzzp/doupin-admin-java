package com.macro.mall.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 修改订单费用信息参数
 * Created by macro on 2018/10/29.
 */
@Getter
@Setter
public class OmsMoneyInfoParam {
    private Long orderId;
    public Long getOrderId() {
		return orderId;
	}
	public BigDecimal getFreightAmount() {
		return freightAmount;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public void setFreightAmount(BigDecimal freightAmount) {
		this.freightAmount = freightAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;
}
