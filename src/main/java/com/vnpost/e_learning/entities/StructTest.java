package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the StructTest database table.
 * 
 */
@Entity
@Table(name = "StructTest")

public class StructTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int countTest;

	private String idUnit;

	private Date lastUpdate;

	private String nameGroup;

	private Date timeCreate;

	//bi-directional many-to-one association to RoundTest
	@OneToMany(mappedBy="structTest")
	private List<RoundTest> roundTests;

	//bi-directional many-to-one association to Levell
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idLevel")
	private Levell levell;

	//bi-directional many-to-one association to Tag
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTag")
	private Tag tag;

	//bi-directional many-to-one association to TypeQuestion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTypeQuestion")
	private TypeQuestion typeQuestion;

	//bi-directional many-to-one association to Test
	@OneToMany(mappedBy="structTest")
	private List<Test> tests;

	public StructTest() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCountTest() {
		return this.countTest;
	}

	public void setCountTest(int countTest) {
		this.countTest = countTest;
	}

	public String getIdUnit() {
		return this.idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameGroup() {
		return this.nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<RoundTest> getRoundTests() {
		return this.roundTests;
	}

	public void setRoundTests(List<RoundTest> roundTests) {
		this.roundTests = roundTests;
	}

	public RoundTest addRoundTest(RoundTest roundTest) {
		getRoundTests().add(roundTest);
		roundTest.setStructTest(this);

		return roundTest;
	}

	public RoundTest removeRoundTest(RoundTest roundTest) {
		getRoundTests().remove(roundTest);
		roundTest.setStructTest(null);

		return roundTest;
	}

	public Levell getLevell() {
		return this.levell;
	}

	public void setLevell(Levell levell) {
		this.levell = levell;
	}

	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public TypeQuestion getTypeQuestion() {
		return this.typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public List<Test> getTests() {
		return this.tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public Test addTest(Test test) {
		getTests().add(test);
		test.setStructTest(this);

		return test;
	}

	public Test removeTest(Test test) {
		getTests().remove(test);
		test.setStructTest(null);

		return test;
	}

}