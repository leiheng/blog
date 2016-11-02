package com.microman.blog.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microman.blog.mapper.WorkHouseMapper;
import com.microman.blog.vo.WorkHouse;

@Service
public class WorkHouseService extends BaseService<WorkHouse>{

	@Autowired(required=true)
	WorkHouseMapper workHouseMapper;
	
	public WorkHouse findByHid(BigInteger hId) {
		return workHouseMapper.findByHid(hId);
	}
	 
}
