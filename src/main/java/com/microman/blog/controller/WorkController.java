package com.microman.blog.controller;

import java.math.BigInteger;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microman.blog.common.CommonStatus;
import com.microman.blog.common.CommonResponse;
import com.microman.blog.service.WorkHouseService;
import com.microman.blog.vo.WorkHouse;

/**
 * 工作记录相关
 * @author helijun
 *
 * @Date 2016-11-02
 */
@Controller
@RequestMapping("/rest/work")
public class WorkController {
	@Resource
	WorkHouseService workHouseService;

    @RequestMapping(value = "/house-info/{hid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResponse findByUid(@PathVariable("hid") BigInteger hId) {
    	try {
    		WorkHouse workHouse = workHouseService.findByHid(hId);
    		if (null != workHouse) {
    			return new CommonResponse(CommonStatus.SUCCESS,workHouse,"获取房子信息成功");
			}else{
				return new CommonResponse(CommonStatus.SUCCESS,"没有该房子");
			}
		} catch (Exception e) {
	        return new CommonResponse(CommonStatus.ERROR,"获取房子信息失败");
		}
    }
}
