package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the Configurationn database table.
 * 
 */
@Entity
@Table(name = "Configurationn")

public class Configurationn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private int statusConfigurationn;

	private Date timeCreate;

	private String valueConfigurationn;

	//bi-directional many-to-one association to TypeData
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTypeData")
	private TypeData typeData;

	public Configurationn() {
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

	public int getStatusConfigurationn() {
		return statusConfigurationn;
	}

	public void setStatusConfigurationn(int statusConfigurationn) {
		this.statusConfigurationn = statusConfigurationn;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public String getValueConfigurationn() {
		return valueConfigurationn;
	}

	public void setValueConfigurationn(String valueConfigurationn) {
		this.valueConfigurationn = valueConfigurationn;
	}

	public TypeData getTypeData() {
		return typeData;
	}

	public void setTypeData(TypeData typeData) {
		this.typeData = typeData;
	}

	
}