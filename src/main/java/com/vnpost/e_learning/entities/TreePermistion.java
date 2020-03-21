package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreePermistion database table.
 * 
 */
@Entity
@Table(name = "TreePermistion")

public class TreePermistion implements Serializable {
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


	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to Permistion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPermistionOne")
	private Permistion permistion1;

	//bi-directional many-to-one association to Permistion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPermistionTwo")
	private Permistion permistion2;

	public TreePermistion() {
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

	public Permistion getPermistion1() {
		return this.permistion1;
	}

	public void setPermistion1(Permistion permistion1) {
		this.permistion1 = permistion1;
	}

	public Permistion getPermistion2() {
		return this.permistion2;
	}

	public void setPermistion2(Permistion permistion2) {
		this.permistion2 = permistion2;
	}

}