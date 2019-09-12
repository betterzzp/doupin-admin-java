package com.macro.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macro.mall.dao.BannerDao;
import com.macro.mall.dto.Banner;
import com.macro.mall.service.BannerService;
@Service
public class BannerServiceImpl implements BannerService {
	@Autowired
	private BannerDao bannerMapper;
	@Override
	public int insert(Banner banner) {
		// TODO Auto-generated method stub
		return bannerMapper.insertList(banner);
	}
	@Override
	public List<Banner> list(Integer pageSize, Integer pageNum) {
		// TODO Auto-generated method stub
		return bannerMapper.list(pageSize,pageNum);
	}
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		 bannerMapper.delete(id);
	}

}
