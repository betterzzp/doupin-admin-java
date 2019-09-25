package com.macro.mall.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.macro.mall.allenum.AllStatusEnum;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.GoodDetail;
import com.macro.mall.dto.GoodMeasurement;
import com.macro.mall.dto.GoodParam;
import com.macro.mall.dto.Goods;
import com.macro.mall.service.GoodsService;
import com.macro.mall.util.ToutiaoUtil;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	@ApiOperation("添加banner图")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult delivery(@RequestBody Goods goods) {
		goods.setStatus(AllStatusEnum.save);
		goods.setId(UUID.randomUUID().toString().toString().replace("-", ""));
		goodsService.insert(goods);
		List<GoodDetail> goodDetail = goods.getGoodDetail();
		List<GoodParam> goodParam = goods.getGoodParam();
		List<GoodMeasurement> goodsMeasurement = goods.getGoodsMeasurement();
		for(GoodDetail param:goodDetail) {
			param.setId(UUID.randomUUID().toString().toString().replace("-", ""));
			param.setGoodId(goods.getId());
			goodsService.insertGoodDetail(param);
		}
		for(GoodParam param:goodParam) {
			param.setId(UUID.randomUUID().toString().toString().replace("-", ""));
			param.setGoodId(goods.getId());
			goodsService.insertGoodParam(param);
		}
		for(GoodMeasurement param:goodsMeasurement) {
			param.setId(UUID.randomUUID().toString().toString().replace("-", ""));
			param.setGoodId(goods.getId());
			goodsService.insertGoodMeasurement(param);
		}
	    return CommonResult.success(null, "添加成功");
	}
	@ApiOperation("分页查询banner图片")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult getDataByPage(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
	        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		//bannerService.list(pageSize,pageNum);
	    return CommonResult.success(goodsService.list(pageSize,pageNum), "添加成功");
	    }
	 
	    @ApiOperation("批量删除订单")
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	@ResponseBody
	public String delete(@PathVariable String  id) {
		goodsService.delete(id);
	    return ToutiaoUtil.getJSONString(200, "删除成功");
	}
}
