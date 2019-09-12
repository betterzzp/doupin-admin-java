package com.macro.mall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.macro.mall.dto.Banner;

public interface BannerService {
	public int insert(Banner banner);

	public List<Banner> list(@Param("pageSize")Integer pageSize,@Param("pageNum")Integer pageNum);

	public void delete(String id);
}
