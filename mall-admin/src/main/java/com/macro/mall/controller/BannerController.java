package com.macro.mall.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.macro.mall.allenum.AllStatusEnum;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.Banner;
import com.macro.mall.service.BannerService;
import com.macro.mall.service.QiniuService;
import com.macro.mall.util.ToutiaoUtil;

import cn.hutool.core.lang.UUID;
import io.swagger.annotations.ApiOperation;
@Controller
@RequestMapping("/banner")
public class BannerController {
	@Autowired
	private BannerService bannerService;
	@Autowired
	private QiniuService qiniuService;
	@ApiOperation("添加banner图")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delivery(@RequestBody Banner banner) {
		banner.setStatus(AllStatusEnum.save);
		banner.setId(UUID.randomUUID().toString().toString().replace("-", ""));
		bannerService.insert(banner);
        return CommonResult.success(null, "添加成功");
    }
	@ApiOperation("分页查询banner图片")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getDataByPage(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		//bannerService.list(pageSize,pageNum);
        return CommonResult.success(bannerService.list(pageSize,pageNum), "添加成功");
    }
    @RequestMapping(path = {"/uploadImage"}, method = {RequestMethod.POST})
    @ResponseBody
    public String uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            String fileUrl = qiniuService.saveImage(file);
            if (fileUrl == null) {
                return ToutiaoUtil.getJSONString(200, "上传图片失败");
            }
            return ToutiaoUtil.getJSONString(200, fileUrl);
        } catch (Exception e) {
            return ToutiaoUtil.getJSONString(200, "上传失败");
        }
    }
    @ApiOperation("批量删除订单")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@PathVariable String  id) {
        bannerService.delete(id);
        return ToutiaoUtil.getJSONString(200, "删除成功");
    }
}
