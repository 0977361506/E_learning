package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Method database table.
 * 
 */
@Entity
@Table(name = "Method")

public class Method implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameMethod;

	private Date timeCreate;

	//bi-directional many-to-one association to StatisticalAction
	@OneToMany(mappedBy="method")
	private List<StatisticalAction> statisticalActions;

	public Method() {
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

	public String getNameMethod() {
		return nameMethod;
	}

	public void setNameMethod(String nameMethod) {
		this.nameMethod = nameMethod;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<StatisticalAction> getStatisticalActions() {
		return statisticalActions;
	}

	public void setStatisticalActions(List<StatisticalAction> statisticalActions) {
		this.statisticalActions = statisticalActions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}