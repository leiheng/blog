package com.microman.blog.vo;

import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WorkHouse {

	//房子id
    private BigInteger hId;
    
    //承包人id
    private BigInteger pId;
    
    //预计需要工作日
    private Integer predictDate;
    
    //开工日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;
    
    //竣工日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;
    
    //房子描述
    private String hDescription;
    
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    
    //最后更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

	public BigInteger gethId() {
		return hId;
	}

	public void sethId(BigInteger hId) {
		this.hId = hId;
	}

	public BigInteger getpId() {
		return pId;
	}

	public void setpId(BigInteger pId) {
		this.pId = pId;
	}

	public Integer getPredictDate() {
		return predictDate;
	}

	public void setPredictDate(Integer predictDate) {
		this.predictDate = predictDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String gethDescription() {
		return hDescription;
	}

	public void sethDescription(String hDescription) {
		this.hDescription = hDescription;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return lastUpdateTime;
	}

	public void setUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public WorkHouse(BigInteger hId, BigInteger pId, Integer predictDate,
			Date startDate, Date endDate, String hDescription, Date createTime,
			Date lastUpdateTime) {
		super();
		this.hId = hId;
		this.pId = pId;
		this.predictDate = predictDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hDescription = hDescription;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	public WorkHouse() {
		super();
	}

}
