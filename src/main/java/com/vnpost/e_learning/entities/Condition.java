package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Condition database table.
 * 
 */
@Entity
@Table(name = "Condition")

public class Condition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameCondition;

	private Date timeCreate;

	//bi-directional many-to-one association to RoundTest
	@OneToMany(mappedBy="condition")
	private List<RoundTest> roundTests;

	public Condition() {
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

	public String getNameCondition() {
		return nameCondition;
	}

	public void setNameCondition(String nameCondition) {
		this.nameCondition = nameCondition;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<RoundTest> getRoundTests() {
		return roundTests;
	}

	public void setRoundTests(List<RoundTest> roundTests) {
		this.roundTests = roundTests;
	}

	
}