package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the ConfigReport database table.
 * 
 */
@Entity
@Table(name = "ConfigReport")

public class ConfigReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String configFilter;

	private String dataSources;

	private Date lastUpdate;

	private String nameConfig;

	private String nameFile;

	private String statusConfig;

	private Date timeCreate;

	private String urlConfig;

	//bi-directional many-to-one association to GroupReport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idGroupReport")
	private GroupReport groupReport;

	public ConfigReport() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConfigFilter() {
		return this.configFilter;
	}

	public void setConfigFilter(String configFilter) {
		this.configFilter = configFilter;
	}

	public String getDataSources() {
		return this.dataSources;
	}

	public void setDataSources(String dataSources) {
		this.dataSources = dataSources;
	}

	

	public String getNameConfig() {
		return this.nameConfig;
	}

	public void setNameConfig(String nameConfig) {
		this.nameConfig = nameConfig;
	}

	public String getNameFile() {
		return this.nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getStatusConfig() {
		return this.statusConfig;
	}

	public void setStatusConfig(String statusConfig) {
		this.statusConfig = statusConfig;
	}

	

	public String getUrlConfig() {
		return this.urlConfig;
	}

	public void setUrlConfig(String urlConfig) {
		this.urlConfig = urlConfig;
	}

	public GroupReport getGroupReport() {
		return this.groupReport;
	}

	public void setGroupReport(GroupReport groupReport) {
		this.groupReport = groupReport;
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

}