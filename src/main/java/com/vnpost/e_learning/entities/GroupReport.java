package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the GroupReport database table.
 * 
 */
@Entity
@Table(name = "GroupReport")

public class GroupReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameGroup;

	private Date timeCreate;

	//bi-directional many-to-one association to ConfigReport
	@OneToMany(mappedBy="groupReport")
	private List<ConfigReport> configReports;

	public GroupReport() {
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

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<ConfigReport> getConfigReports() {
		return configReports;
	}

	public void setConfigReports(List<ConfigReport> configReports) {
		this.configReports = configReports;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}