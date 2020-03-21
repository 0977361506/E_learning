package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the Result database table.
 * 
 */
@Entity
@Table(name = "Result")

public class Result implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String answer;

	private Date lastUpdate;

	private Date timeCreate;

	private Date timeEnd;

	private Date timeStart;

	//bi-directional many-to-one association to Question
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idQuestion")
	private Question question;

	//bi-directional many-to-one association to RoundTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRoundTest")
	private RoundTest roundTest;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public Result() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Date getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Date getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public RoundTest getRoundTest() {
		return this.roundTest;
	}

	public void setRoundTest(RoundTest roundTest) {
		this.roundTest = roundTest;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}