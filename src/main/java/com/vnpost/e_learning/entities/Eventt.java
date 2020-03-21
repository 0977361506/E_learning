package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the Eventt database table.
 * 
 */
@Entity
@Table(name = "")

public class Eventt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int highlinghtEvent;

	private String idUnit;

	private Date lastUpdate;

	private Date timeCreate;

	private Date timeEnd;

	private Date timeStart;

	//bi-directional many-to-one association to DetailCategoryEvent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailCategoryEvent")
	private DetailCategoryEvent detailCategoryEvent;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public Eventt() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getHighlinghtEvent() {
		return highlinghtEvent;
	}

	public void setHighlinghtEvent(int highlinghtEvent) {
		this.highlinghtEvent = highlinghtEvent;
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

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public DetailCategoryEvent getDetailCategoryEvent() {
		return detailCategoryEvent;
	}

	public void setDetailCategoryEvent(DetailCategoryEvent detailCategoryEvent) {
		this.detailCategoryEvent = detailCategoryEvent;
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