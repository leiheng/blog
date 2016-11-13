package com.microman.blog.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microman.blog.common.CommonResponse;
import com.microman.blog.common.CommonStatus;
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
	@Resource
	BlogListService blogListService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BlogListController.class);
	
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResponse blogInfo() {
    	try {
    		List<BlogList> blogInfo = blogListService.blogInfo();
    		if (null != blogInfo) {
    			return new CommonResponse(CommonStatus.SUCCESS,blogInfo,"获取博客列表成功");
			}else{
				return new CommonResponse(CommonStatus.SUCCESS,"没有博客列表");
			}
		} catch (Exception e) {
	        return new CommonResponse(CommonStatus.ERROR,"获取博客列表失败");
		}
    }
}
