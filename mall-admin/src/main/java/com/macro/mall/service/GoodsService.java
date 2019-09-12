package com.macro.mall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.macro.mall.dto.Banner;
import com.macro.mall.dto.Goods;
@Service
public interface GoodsService {
	public int insert(Goods goods);

	public List<Banner> list(@Param("pageSize")Integer pageSize,@Param("pageNum")Integer pageNum);

	public void delete(String id);

}
