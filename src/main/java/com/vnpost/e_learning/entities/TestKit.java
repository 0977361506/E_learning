package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TestKit database table.
 * 
 */
@Entity
@Table(name = "TestKit")

public class TestKit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Lob
	private String describes;

	private Date lastUpdate;

	private String nameTest;

	private Date timeCreate;

	//bi-directional many-to-one association to SourceQuestion
	@OneToMany(mappedBy="testKit")
	private List<SourceQuestion> sourceQuestions;

	//bi-directional many-to-one association to Test
	@OneToMany(mappedBy="testKit")
	private List<Test> tests;

	//bi-directional many-to-one association to TreeTestKit
	@OneToMany(mappedBy="testKit1")
	private List<TreeTestKit> treeTestKits1;

	//bi-directional many-to-one association to TreeTestKit
	@OneToMany(mappedBy="testKit2")
	private List<TreeTestKit> treeTestKits2;

	public TestKit() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescribes() {
		return this.describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameTest() {
		return this.nameTest;
	}

	public void setNameTest(String nameTest) {
		this.nameTest = nameTest;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<SourceQuestion> getSourceQuestions() {
		return this.sourceQuestions;
	}

	public void setSourceQuestions(List<SourceQuestion> sourceQuestions) {
		this.sourceQuestions = sourceQuestions;
	}

	public SourceQuestion addSourceQuestion(SourceQuestion sourceQuestion) {
		getSourceQuestions().add(sourceQuestion);
		sourceQuestion.setTestKit(this);

		return sourceQuestion;
	}

	public SourceQuestion removeSourceQuestion(SourceQuestion sourceQuestion) {
		getSourceQuestions().remove(sourceQuestion);
		sourceQuestion.setTestKit(null);

		return sourceQuestion;
	}

	public List<Test> getTests() {
		return this.tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public Test addTest(Test test) {
		getTests().add(test);
		test.setTestKit(this);

		return test;
	}

	public Test removeTest(Test test) {
		getTests().remove(test);
		test.setTestKit(null);

		return test;
	}

	public List<TreeTestKit> getTreeTestKits1() {
		return this.treeTestKits1;
	}

	public void setTreeTestKits1(List<TreeTestKit> treeTestKits1) {
		this.treeTestKits1 = treeTestKits1;
	}

	public TreeTestKit addTreeTestKits1(TreeTestKit treeTestKits1) {
		getTreeTestKits1().add(treeTestKits1);
		treeTestKits1.setTestKit1(this);

		return treeTestKits1;
	}

	public TreeTestKit removeTreeTestKits1(TreeTestKit treeTestKits1) {
		getTreeTestKits1().remove(treeTestKits1);
		treeTestKits1.setTestKit1(null);

		return treeTestKits1;
	}

	public List<TreeTestKit> getTreeTestKits2() {
		return this.treeTestKits2;
	}

	public void setTreeTestKits2(List<TreeTestKit> treeTestKits2) {
		this.treeTestKits2 = treeTestKits2;
	}

	public TreeTestKit addTreeTestKits2(TreeTestKit treeTestKits2) {
		getTreeTestKits2().add(treeTestKits2);
		treeTestKits2.setTestKit2(this);

		return treeTestKits2;
	}

	public TreeTestKit removeTreeTestKits2(TreeTestKit treeTestKits2) {
		getTreeTestKits2().remove(treeTestKits2);
		treeTestKits2.setTestKit2(null);

		return treeTestKits2;
	}

}