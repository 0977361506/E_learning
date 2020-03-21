package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NewCategory database table.
 * 
 */
@Entity
@Table(name = "NewCategory")

public class NewCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameDetail;

	private Date timeCreate;

	//bi-directional many-to-one association to New
	@OneToMany(mappedBy="newCategory")
	private List<New> news;

	//bi-directional many-to-one association to TreeCategory
	@OneToMany(mappedBy="newCategory1")
	private List<TreeCategory> treeCategories1;

	//bi-directional many-to-one association to TreeCategory
	@OneToMany(mappedBy="newCategory2")
	private List<TreeCategory> treeCategories2;

	public NewCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameDetail() {
		return nameDetail;
	}

	public void setNameDetail(String nameDetail) {
		this.nameDetail = nameDetail;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<New> getNews() {
		return news;
	}

	public void setNews(List<New> news) {
		this.news = news;
	}

	public List<TreeCategory> getTreeCategories1() {
		return treeCategories1;
	}

	public void setTreeCategories1(List<TreeCategory> treeCategories1) {
		this.treeCategories1 = treeCategories1;
	}

	public List<TreeCategory> getTreeCategories2() {
		return treeCategories2;
	}

	public void setTreeCategories2(List<TreeCategory> treeCategories2) {
		this.treeCategories2 = treeCategories2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}