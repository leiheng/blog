package com.microman.blog.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.microman.blog.mapper.BlogListMapper;
import com.microman.blog.vo.BlogList;

@Service
public class BlogListService extends BaseService<BlogList>{

	@Resource
	BlogListMapper blogListMapper;
	
	public List<BlogList> blogInfo() {
		return blogListMapper.blogInfo();
	}
	 
}
