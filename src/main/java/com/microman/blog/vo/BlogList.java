package com.microman.blog.vo;

import java.io.Serializable;
import java.math.BigInteger;

import org.joda.time.DateTime;

public class BlogList implements Serializable{
	
	private static final long serialVersionUID = 3463786979561856007L;
	
	private BigInteger id;
	private String listTitle;//标题
	private String listDescript;//描述
	private String listLink;//链接
	
	private int listType;//分类，1前端，2JAVA，3感悟
	private int isOwner;//1原创、2转载
	private int listFrom;//来源，0博客园，1github，3简书，4...
	
	private int listStatus;//文章状态，1显示，0隐藏
	private int isGood;//是否加精，1是，0否
	
	private BigInteger listRead;//阅读，外键、逗号隔开
	private BigInteger listLike;//喜欢
	private BigInteger listComment;//评论
	
	private String coverImg;//封面图片
	private String coverDesc;//封面描述
	
	private int listSort;//排序位
	private DateTime create_time;//创建时间
	private DateTime update_time;//更新时间
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getListTitle() {
		return listTitle;
	}
	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}
	public String getListDescript() {
		return listDescript;
	}
	public void setListDescript(String listDescript) {
		this.listDescript = listDescript;
	}
	public String getListLink() {
		return listLink;
	}
	public void setListLink(String listLink) {
		this.listLink = listLink;
	}
	public int getListType() {
		return listType;
	}
	public void setListType(int listType) {
		this.listType = listType;
	}
	public int getIsOwner() {
		return isOwner;
	}
	public void setIsOwner(int isOwner) {
		this.isOwner = isOwner;
	}
	public int getListFrom() {
		return listFrom;
	}
	public void setListFrom(int listFrom) {
		this.listFrom = listFrom;
	}
	public int getListStatus() {
		return listStatus;
	}
	public void setListStatus(int listStatus) {
		this.listStatus = listStatus;
	}
	public int getIsGood() {
		return isGood;
	}
	public void setIsGood(int isGood) {
		this.isGood = isGood;
	}
	public BigInteger getListRead() {
		return listRead;
	}
	public void setListRead(BigInteger listRead) {
		this.listRead = listRead;
	}
	public BigInteger getListLike() {
		return listLike;
	}
	public void setListLike(BigInteger listLike) {
		this.listLike = listLike;
	}
	public BigInteger getListComment() {
		return listComment;
	}
	public void setListComment(BigInteger listComment) {
		this.listComment = listComment;
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
	public int getListSort() {
		return listSort;
	}
	public void setListSort(int listSort) {
		this.listSort = listSort;
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
	public BlogList(BigInteger id, String listTitle, String listDescript,
			String listLink, int listType, int isOwner, int listFrom,
			int listStatus, int isGood, BigInteger listRead,
			BigInteger listLike, BigInteger listComment, String coverImg,
			String coverDesc, int listSort, DateTime create_time,
			DateTime update_time) {
		super();
		this.id = id;
		this.listTitle = listTitle;
		this.listDescript = listDescript;
		this.listLink = listLink;
		this.listType = listType;
		this.isOwner = isOwner;
		this.listFrom = listFrom;
		this.listStatus = listStatus;
		this.isGood = isGood;
		this.listRead = listRead;
		this.listLike = listLike;
		this.listComment = listComment;
		this.coverImg = coverImg;
		this.coverDesc = coverDesc;
		this.listSort = listSort;
		this.create_time = create_time;
		this.update_time = update_time;
	}
	public BlogList() {
		super();
	}
}
