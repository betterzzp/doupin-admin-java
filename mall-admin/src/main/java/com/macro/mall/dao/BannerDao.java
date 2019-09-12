package com.macro.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.macro.mall.dto.Banner;

public interface BannerDao {
	int insertList(@Param("banner") Banner banner);

	List<Banner> list(Integer pageSize, Integer pageNum);

	void delete(@Param("id")String id);
}
