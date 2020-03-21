package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreeCategory database table.
 * 
 */
@Entity
@Table(name = "TreeCategory")

public class TreeCategory implements Serializable {
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

	private long idDetailCategoryTwo;

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to NewCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailCategoryOne",insertable = false, updatable = false)
	private NewCategory newCategory1;

	//bi-directional many-to-one association to NewCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailCategoryOne")
	private NewCategory newCategory2;

	public TreeCategory() {
	}

	public long getIdDetailCategoryTwo() {
		return this.idDetailCategoryTwo;
	}

	public void setIdDetailCategoryTwo(long idDetailCategoryTwo) {
		this.idDetailCategoryTwo = idDetailCategoryTwo;
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

	public NewCategory getNewCategory1() {
		return this.newCategory1;
	}

	public void setNewCategory1(NewCategory newCategory1) {
		this.newCategory1 = newCategory1;
	}

	public NewCategory getNewCategory2() {
		return this.newCategory2;
	}

	public void setNewCategory2(NewCategory newCategory2) {
		this.newCategory2 = newCategory2;
	}

}