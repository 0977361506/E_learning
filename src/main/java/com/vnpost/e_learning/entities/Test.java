package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Test database table.
 * 
 */
@Entity
@Table(name = "Test")

public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String name;

	private Date timeCreate;

	private int typeTest;

	//bi-directional many-to-one association to QuestionTest
	@OneToMany(mappedBy="test")
	private List<QuestionTest> questionTests;

	//bi-directional many-to-one association to StructTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idStructTest")
	private StructTest structTest;

	//bi-directional many-to-one association to TestKit
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTestKit")
	private TestKit testKit;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public Test() {
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

	public int getTypeTest() {
		return this.typeTest;
	}

	public void setTypeTest(int typeTest) {
		this.typeTest = typeTest;
	}

	public List<QuestionTest> getQuestionTests() {
		return this.questionTests;
	}

	public void setQuestionTests(List<QuestionTest> questionTests) {
		this.questionTests = questionTests;
	}

	public QuestionTest addQuestionTest(QuestionTest questionTest) {
		getQuestionTests().add(questionTest);
		questionTest.setTest(this);

		return questionTest;
	}

	public QuestionTest removeQuestionTest(QuestionTest questionTest) {
		getQuestionTests().remove(questionTest);
		questionTest.setTest(null);

		return questionTest;
	}

	public StructTest getStructTest() {
		return this.structTest;
	}

	public void setStructTest(StructTest structTest) {
		this.structTest = structTest;
	}

	public TestKit getTestKit() {
		return this.testKit;
	}

	public void setTestKit(TestKit testKit) {
		this.testKit = testKit;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}