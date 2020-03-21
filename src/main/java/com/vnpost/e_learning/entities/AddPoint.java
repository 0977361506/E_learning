package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the AddPoint database table.
 * 
 */
@Entity
@Table(name = "AddPoint")
public class AddPoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int addPoint;

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to RoundTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRoundTest")
	private RoundTest roundTest;

	//bi-directional many-to-one association to TypeQuestion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTypeQuestion")
	private TypeQuestion typeQuestion;

	public AddPoint() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAddPoint() {
		return this.addPoint;
	}

	public void setAddPoint(int addPoint) {
		this.addPoint = addPoint;
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

	public RoundTest getRoundTest() {
		return this.roundTest;
	}

	public void setRoundTest(RoundTest roundTest) {
		this.roundTest = roundTest;
	}

	public TypeQuestion getTypeQuestion() {
		return this.typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

}