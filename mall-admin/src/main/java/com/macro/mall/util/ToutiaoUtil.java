package com.macro.mall.util;

import com.alibaba.fastjson.JSONObject;

public class ToutiaoUtil {
	public static String getJSONString(int code, String msg) {
        JSONObject json = new JSONObject();
        json.put("code", code);
        json.put("msg", msg);
        return json.toJSONString();
    }
}
