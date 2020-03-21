package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the SubPoint database table.
 * 
 */
@Entity
@Table(name = "SubPoint")

public class SubPoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private Date lastUpdate;

	private int sub;

	private Date timeCreate;

	//bi-directional many-to-one association to RoundTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRoundTest")
	private RoundTest roundTest;

	//bi-directional many-to-one association to TypeQuestion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTypeQuestion")
	private TypeQuestion typeQuestion;

	public SubPoint() {
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

	public int getSub() {
		return this.sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
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