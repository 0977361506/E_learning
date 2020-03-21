package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreeQuestion database table.
 * 
 */
@Entity
@Table(name = "TreeQuestion")

public class TreeQuestion implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to QuestionCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idQuestionCategoryOne")
	private QuestionCategory questionCategory1;

	//bi-directional many-to-one association to QuestionCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idQuestionCategoryTwo")
	private QuestionCategory questionCategory2;

	public TreeQuestion() {
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

	public QuestionCategory getQuestionCategory1() {
		return this.questionCategory1;
	}

	public void setQuestionCategory1(QuestionCategory questionCategory1) {
		this.questionCategory1 = questionCategory1;
	}

	public QuestionCategory getQuestionCategory2() {
		return this.questionCategory2;
	}

	public void setQuestionCategory2(QuestionCategory questionCategory2) {
		this.questionCategory2 = questionCategory2;
	}

}