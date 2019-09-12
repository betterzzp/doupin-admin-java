package com.macro.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.macro.mall.dto.Banner;
import com.macro.mall.dto.Goods;

public interface GoodsDao {
	int insertList(@Param("goods") Goods goods);

	List<Banner> list(Integer pageSize, Integer pageNum);

	void delete(@Param("id")String id);
}
