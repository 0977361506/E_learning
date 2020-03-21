package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the DetailPermisstion database table.
 * 
 */
@Entity
@Table(name = "DetailPermisstion")

public class DetailPermisstion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameDetail;

	private Date timeCreate;

	//bi-directional many-to-one association to Permistion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPermistion")
	private Permistion permistion;

	public DetailPermisstion() {
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

	public Permistion getPermistion() {
		return permistion;
	}

	public void setPermistion(Permistion permistion) {
		this.permistion = permistion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}