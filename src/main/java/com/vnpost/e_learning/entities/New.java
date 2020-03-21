package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the News database table.
 * 
 */
@Entity
@Table(name="News")

public class New implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private int highlightNew;

	private String idUnit;

	private Date lastUpdate;

	private int statusNew;

	private Date timeCreate;

	private String title;

	//bi-directional many-to-one association to NewCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailCategory")
	private NewCategory newCategory;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public New() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getHighlightNew() {
		return highlightNew;
	}

	public void setHighlightNew(int highlightNew) {
		this.highlightNew = highlightNew;
	}

	public String getIdUnit() {
		return idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getStatusNew() {
		return statusNew;
	}

	public void setStatusNew(int statusNew) {
		this.statusNew = statusNew;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public NewCategory getNewCategory() {
		return newCategory;
	}

	public void setNewCategory(NewCategory newCategory) {
		this.newCategory = newCategory;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}