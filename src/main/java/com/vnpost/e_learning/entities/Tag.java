package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Tags database table.
 * 
 */
@Entity
@Table(name="Tags")

public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String name;

	private Date timeCreate;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="tag")
	private List<Question> questions;

	//bi-directional many-to-one association to StructTest
	@OneToMany(mappedBy="tag")
	private List<StructTest> structTests;

	public Tag() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setTag(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setTag(null);

		return question;
	}

	public List<StructTest> getStructTests() {
		return this.structTests;
	}

	public void setStructTests(List<StructTest> structTests) {
		this.structTests = structTests;
	}

	public StructTest addStructTest(StructTest structTest) {
		getStructTests().add(structTest);
		structTest.setTag(this);

		return structTest;
	}

	public StructTest removeStructTest(StructTest structTest) {
		getStructTests().remove(structTest);
		structTest.setTag(null);

		return structTest;
	}

}