package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Prioritize database table.
 * 
 */
@Entity
@Table(name = "Prioritize")

public class Prioritize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String namePrioritize;

	private Date timeCreate;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="prioritize")
	private List<Document> documents;

	public Prioritize() {
	}

	public long getId() {
		return id;
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

	public String getNamePrioritize() {
		return namePrioritize;
	}

	public void setNamePrioritize(String namePrioritize) {
		this.namePrioritize = namePrioritize;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}