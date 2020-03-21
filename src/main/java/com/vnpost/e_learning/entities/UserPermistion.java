package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the UserPermistion database table.
 * 
 */
@Entity
@Table(name = "UserPermistion")

public class UserPermistion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to Permistion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPermistion")
	private Permistion permistion;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public UserPermistion() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Permistion getPermistion() {
		return this.permistion;
	}

	public void setPermistion(Permistion permistion) {
		this.permistion = permistion;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}