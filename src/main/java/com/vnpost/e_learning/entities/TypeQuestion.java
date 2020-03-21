package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TypeQuestion database table.
 * 
 */
@Entity
@Table(name = "TypeQuestion")

public class TypeQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameType;

	private Date timeCreate;

	//bi-directional many-to-one association to AddPoint
	@OneToMany(mappedBy="typeQuestion")
	private List<AddPoint> addPoints;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="typeQuestion")
	private List<Question> questions;

	//bi-directional many-to-one association to StructTest
	@OneToMany(mappedBy="typeQuestion")
	private List<StructTest> structTests;

	//bi-directional many-to-one association to SubPoint
	@OneToMany(mappedBy="typeQuestion")
	private List<SubPoint> subPoints;

	public TypeQuestion() {
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

	public List<AddPoint> getAddPoints() {
		return this.addPoints;
	}

	public void setAddPoints(List<AddPoint> addPoints) {
		this.addPoints = addPoints;
	}

	public AddPoint addAddPoint(AddPoint addPoint) {
		getAddPoints().add(addPoint);
		addPoint.setTypeQuestion(this);

		return addPoint;
	}

	public AddPoint removeAddPoint(AddPoint addPoint) {
		getAddPoints().remove(addPoint);
		addPoint.setTypeQuestion(null);

		return addPoint;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setTypeQuestion(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setTypeQuestion(null);

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
		structTest.setTypeQuestion(this);

		return structTest;
	}

	public StructTest removeStructTest(StructTest structTest) {
		getStructTests().remove(structTest);
		structTest.setTypeQuestion(null);

		return structTest;
	}

	public List<SubPoint> getSubPoints() {
		return this.subPoints;
	}

	public void setSubPoints(List<SubPoint> subPoints) {
		this.subPoints = subPoints;
	}

	public SubPoint addSubPoint(SubPoint subPoint) {
		getSubPoints().add(subPoint);
		subPoint.setTypeQuestion(this);

		return subPoint;
	}

	public SubPoint removeSubPoint(SubPoint subPoint) {
		getSubPoints().remove(subPoint);
		subPoint.setTypeQuestion(null);

		return subPoint;
	}

}