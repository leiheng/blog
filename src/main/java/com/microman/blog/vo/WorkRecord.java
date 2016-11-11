package com.microman.blog.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import org.joda.time.DateTime;

public class WorkRecord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4901237522935427647L;

	//记录id
    private BigInteger rId;
    
    //记录者
    private BigInteger pId;
    
    //所属房子id
    private BigInteger hId;
    
    //工作日期
    private Date rDate;
    
    //工作者,是否满整天;如1,0;2,1;3,0.5;4,-1; 0整体、0.5半天，-1没来，其他代表工作小时
    private String pIdIsfull;
    
    //备注
    private String remark;
    
    //天气
    private Integer rWeather;
    
    //记录时间
    private DateTime createTime;

	public BigInteger getrId() {
		return rId;
	}

	public void setrId(BigInteger rId) {
		this.rId = rId;
	}

	public BigInteger getpId() {
		return pId;
	}

	public void setpId(BigInteger pId) {
		this.pId = pId;
	}

	public BigInteger gethId() {
		return hId;
	}

	public void sethId(BigInteger hId) {
		this.hId = hId;
	}

	public Date getrDate() {
		return rDate;
	}

	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}

	public String getpIdIsfull() {
		return pIdIsfull;
	}

	public void setpIdIsfull(String pIdIsfull) {
		this.pIdIsfull = pIdIsfull;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getrWeather() {
		return rWeather;
	}

	public void setrWeather(Integer rWeather) {
		this.rWeather = rWeather;
	}

	public DateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(DateTime createTime) {
		this.createTime = createTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public WorkRecord(BigInteger rId, BigInteger pId, BigInteger hId,
			Date rDate, String pIdIsfull, String remark, Integer rWeather,
			DateTime createTime) {
		super();
		this.rId = rId;
		this.pId = pId;
		this.hId = hId;
		this.rDate = rDate;
		this.pIdIsfull = pIdIsfull;
		this.remark = remark;
		this.rWeather = rWeather;
		this.createTime = createTime;
	}

	public WorkRecord() {
		super();
	}
    
}
