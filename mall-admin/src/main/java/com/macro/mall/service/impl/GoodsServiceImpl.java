package com.macro.mall.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macro.mall.dao.GoodsDao;
import com.macro.mall.dto.Banner;
import com.macro.mall.dto.GoodDetail;
import com.macro.mall.dto.GoodMeasurement;
import com.macro.mall.dto.GoodParam;
import com.macro.mall.dto.Goods;
import com.macro.mall.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsMapper;
	@Override
	public int insert(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.insertList(goods);
		return 0;
	}
	@Override
	public List<Banner> list(Integer pageSize, Integer pageNum) {
		// TODO Auto-generated method stub
		return goodsMapper.list(pageSize,pageNum);
	}
	@Override
	public void delete(String id) {
		goodsMapper.delete(id);
	}
	@Override
	public int insertGoodDetail(GoodDetail goodDetail) {
		// TODO Auto-generated method stub
		return goodsMapper.insertGoodDetail(goodDetail);
	}

	@Override
	public int insertGoodParam(GoodParam goodParam) {
		// TODO Auto-generated method stub
		return goodsMapper.insertGoodParam(goodParam);
	}

	@Override
	public int insertGoodMeasurement(GoodMeasurement goodMeasurement) {
		// TODO Auto-generated method stub
		return goodsMapper.insertGoodMeasurement(goodMeasurement);
	}

}
