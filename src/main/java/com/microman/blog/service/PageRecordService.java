package com.microman.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microman.blog.mapper.PageRecordMapper;
import com.microman.blog.vo.PageRecord;

@Service
public class PageRecordService extends BaseService<PageRecord>{

	@Autowired(required=true)
	PageRecordMapper pageRecordMapper;
	
	public int insertRecord(PageRecord pageRecord) {
		return pageRecordMapper.insertRecord(pageRecord);
	}
	 
}
