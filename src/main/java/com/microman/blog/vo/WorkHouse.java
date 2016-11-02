package com.microman.blog.vo;

import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WorkHouse {

    private BigInteger hId;
    
    private BigInteger pId;
    
    private Integer predictDate;
    
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;
    
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;
    
    private String hDescription;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    
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
