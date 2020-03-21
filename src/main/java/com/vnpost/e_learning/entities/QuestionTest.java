package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the QuestionTest database table.
 * 
 */
@Entity
@Table(name = "QuestionTest")

public class QuestionTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to Question
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idQuestion")
	private Question question;

	//bi-directional many-to-one association to Test
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTest")
	private Test test;

	public QuestionTest() {
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

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}