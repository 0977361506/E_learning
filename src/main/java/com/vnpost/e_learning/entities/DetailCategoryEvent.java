package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DetailCategoryEvent database table.
 * 
 */
@Entity
@Table(name = "DetailCategoryEvent")

public class DetailCategoryEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameDetail;

	private Date timeCreate;

	//bi-directional many-to-one association to Eventt
	@OneToMany(mappedBy="detailCategoryEvent")
	private List<Eventt> eventts;

	//bi-directional many-to-one association to TreeEvent
	@OneToMany(mappedBy="detailCategoryEvent1")
	private List<TreeEvent> treeEvents1;

	//bi-directional many-to-one association to TreeEvent
	@OneToMany(mappedBy="detailCategoryEvent2")
	private List<TreeEvent> treeEvents2;

	public DetailCategoryEvent() {
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

	public List<Eventt> getEventts() {
		return eventts;
	}

	public void setEventts(List<Eventt> eventts) {
		this.eventts = eventts;
	}

	public List<TreeEvent> getTreeEvents1() {
		return treeEvents1;
	}

	public void setTreeEvents1(List<TreeEvent> treeEvents1) {
		this.treeEvents1 = treeEvents1;
	}

	public List<TreeEvent> getTreeEvents2() {
		return treeEvents2;
	}

	public void setTreeEvents2(List<TreeEvent> treeEvents2) {
		this.treeEvents2 = treeEvents2;
	}

	
}