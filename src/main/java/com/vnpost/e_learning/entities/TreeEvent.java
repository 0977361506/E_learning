package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreeEvent database table.
 * 
 */
@Entity
@Table(name = "TreeEvent")

public class TreeEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to DetailCategoryEvent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailCategoryEventOne")
	private DetailCategoryEvent detailCategoryEvent1;

	//bi-directional many-to-one association to DetailCategoryEvent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailCategoryEventTwo")
	private DetailCategoryEvent detailCategoryEvent2;

	public TreeEvent() {
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public DetailCategoryEvent getDetailCategoryEvent1() {
		return this.detailCategoryEvent1;
	}

	public void setDetailCategoryEvent1(DetailCategoryEvent detailCategoryEvent1) {
		this.detailCategoryEvent1 = detailCategoryEvent1;
	}

	public DetailCategoryEvent getDetailCategoryEvent2() {
		return this.detailCategoryEvent2;
	}

	public void setDetailCategoryEvent2(DetailCategoryEvent detailCategoryEvent2) {
		this.detailCategoryEvent2 = detailCategoryEvent2;
	}

}