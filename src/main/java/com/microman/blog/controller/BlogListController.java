package com.microman.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microman.blog.common.CommonStatus;
import com.microman.blog.common.JsonResult;
import com.microman.blog.service.BlogListService;
import com.microman.blog.vo.BlogList;

/**
 * 博客相关
 * @author helijun
 *
 * @Date 2016-11-11
 */
@Controller
@RequestMapping("/rest/blog")
public class BlogListController {
	@Autowired
	BlogListService blogListService;
	
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult blogInfo() {
    	try {
    		List<BlogList> blogInfo = blogListService.blogInfo();
    		if (null != blogInfo) {
    			return new JsonResult(CommonStatus.SUCCESS,blogInfo,"获取博客列表成功");
			}else{
				return new JsonResult(CommonStatus.SUCCESS,"没有博客列表");
			}
		} catch (Exception e) {
	        return new JsonResult(CommonStatus.ERROR,"获取博客列表失败");
		}
    }
}
