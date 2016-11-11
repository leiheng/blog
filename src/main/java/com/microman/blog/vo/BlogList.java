package com.microman.blog.vo;

import java.io.Serializable;
import java.math.BigInteger;

import org.joda.time.DateTime;

public class BlogList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3463786979561856007L;
	private BigInteger id;
	private String title;//标题
	private String descript;//描述
	private String link;//链接
	private int type;//0博客园，1github
	private String liRead;//阅读，外键、逗号隔开
	private String liLike;//喜欢
	
	private String liComment;//评论
	private String coverImg;//封面图片
	private String coverDesc;//封面描述
	private int sort;//排序位
	private DateTime create_time;//创建时间
	private DateTime update_time;//更新时间
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getLiRead() {
		return liRead;
	}
	public void setLiRead(String liRead) {
		this.liRead = liRead;
	}
	public String getLiLike() {
		return liLike;
	}
	public void setLiLike(String liLike) {
		this.liLike = liLike;
	}
	public String getLiComment() {
		return liComment;
	}
	public void setLiComment(String liComment) {
		this.liComment = liComment;
	}
	public String getCoverImg() {
		return coverImg;
	}
	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}
	public String getCoverDesc() {
		return coverDesc;
	}
	public void setCoverDesc(String coverDesc) {
		this.coverDesc = coverDesc;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public DateTime getCreate_time() {
		return create_time;
	}
	public void setCreate_time(DateTime create_time) {
		this.create_time = create_time;
	}
	public DateTime getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(DateTime update_time) {
		this.update_time = update_time;
	}
	public BlogList(BigInteger id, String title, String descript, String link,
			int type, String liRead, String liLike, String liComment,
			String coverImg, String coverDesc, int sort, DateTime create_time,
			DateTime update_time) {
		super();
		this.id = id;
		this.title = title;
		this.descript = descript;
		this.link = link;
		this.type = type;
		this.liRead = liRead;
		this.liLike = liLike;
		this.liComment = liComment;
		this.coverImg = coverImg;
		this.coverDesc = coverDesc;
		this.sort = sort;
		this.create_time = create_time;
		this.update_time = update_time;
	}
	public BlogList() {
		super();
	}
	
}
