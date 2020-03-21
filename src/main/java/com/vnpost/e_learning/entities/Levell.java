package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Levell database table.
 * 
 */
@Entity
@Table(name = "Levell")

public class Levell implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameLevell;

	private Date timeCreate;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="levell")
	private List<Question> questions;

	//bi-directional many-to-one association to StructTest
	@OneToMany(mappedBy="levell")
	private List<StructTest> structTests;

	public Levell() {
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

	public String getNameLevell() {
		return nameLevell;
	}

	public void setNameLevell(String nameLevell) {
		this.nameLevell = nameLevell;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<StructTest> getStructTests() {
		return structTests;
	}

	public void setStructTests(List<StructTest> structTests) {
		this.structTests = structTests;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}