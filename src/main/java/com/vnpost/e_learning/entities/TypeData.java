package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TypeData database table.
 * 
 */
@Entity
@Table(name = "TypeData")

public class TypeData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameType;

	private Date timeCreate;

	//bi-directional many-to-one association to Configurationn
	@OneToMany(mappedBy="typeData")
	private List<Configurationn> configurationns;

	public TypeData() {
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

	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Configurationn> getConfigurationns() {
		return this.configurationns;
	}

	public void setConfigurationns(List<Configurationn> configurationns) {
		this.configurationns = configurationns;
	}

	public Configurationn addConfigurationn(Configurationn configurationn) {
		getConfigurationns().add(configurationn);
		configurationn.setTypeData(this);

		return configurationn;
	}

	public Configurationn removeConfigurationn(Configurationn configurationn) {
		getConfigurationns().remove(configurationn);
		configurationn.setTypeData(null);

		return configurationn;
	}

}