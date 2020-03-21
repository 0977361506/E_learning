package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the QuestionCategory database table.
 * 
 */
@Entity
@Table(name = "QuestionCategory")

public class QuestionCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String describes;

	private String idUnit;

	private Date lastUpdate;

	private String name_Category;

	private int shares;

	private Date timeCreate;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="questionCategory")
	private List<Question> questions;

	//bi-directional many-to-one association to TreeQuestion
	@OneToMany(mappedBy="questionCategory1")
	private List<TreeQuestion> treeQuestions1;

	//bi-directional many-to-one association to TreeQuestion
	@OneToMany(mappedBy="questionCategory2")
	private List<TreeQuestion> treeQuestions2;

	public QuestionCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public String getIdUnit() {
		return idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getName_Category() {
		return name_Category;
	}

	public void setName_Category(String name_Category) {
		this.name_Category = name_Category;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<TreeQuestion> getTreeQuestions1() {
		return treeQuestions1;
	}

	public void setTreeQuestions1(List<TreeQuestion> treeQuestions1) {
		this.treeQuestions1 = treeQuestions1;
	}

	public List<TreeQuestion> getTreeQuestions2() {
		return treeQuestions2;
	}

	public void setTreeQuestions2(List<TreeQuestion> treeQuestions2) {
		this.treeQuestions2 = treeQuestions2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}