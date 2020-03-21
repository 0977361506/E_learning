package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Question database table.
 * 
 */
@Entity
@Table(name = "Question")

public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Lob
	private String explain;

	private long idTypeQuestion;

	private Date lastUpdate;

	private int mix;

	@Lob
	private String question;

	private int statusQuestion;

	private Date timeCreate;

	//bi-directional many-to-one association to Answer
	@OneToMany(mappedBy="question")
	private List<Answer> answers;

	//bi-directional many-to-one association to Levell
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idLevel")
	private Levell levell;

	//bi-directional many-to-one association to QuestionCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idQuestionCategory")
	private QuestionCategory questionCategory;

	//bi-directional many-to-one association to Tag
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTag")
	private Tag tag;

	//bi-directional many-to-one association to TypeQuestion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idType")
	private TypeQuestion typeQuestion;

	//bi-directional many-to-one association to QuestionRoundTest
	@OneToMany(mappedBy="question")
	private List<QuestionRoundTest> questionRoundTests;

	//bi-directional many-to-one association to QuestionTest
	@OneToMany(mappedBy="question")
	private List<QuestionTest> questionTests;

	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="question")
	private List<Result> results;

	public Question() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public long getIdTypeQuestion() {
		return idTypeQuestion;
	}

	public void setIdTypeQuestion(long idTypeQuestion) {
		this.idTypeQuestion = idTypeQuestion;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getMix() {
		return mix;
	}

	public void setMix(int mix) {
		this.mix = mix;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getStatusQuestion() {
		return statusQuestion;
	}

	public void setStatusQuestion(int statusQuestion) {
		this.statusQuestion = statusQuestion;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Levell getLevell() {
		return levell;
	}

	public void setLevell(Levell levell) {
		this.levell = levell;
	}

	public QuestionCategory getQuestionCategory() {
		return questionCategory;
	}

	public void setQuestionCategory(QuestionCategory questionCategory) {
		this.questionCategory = questionCategory;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public List<QuestionRoundTest> getQuestionRoundTests() {
		return questionRoundTests;
	}

	public void setQuestionRoundTests(List<QuestionRoundTest> questionRoundTests) {
		this.questionRoundTests = questionRoundTests;
	}

	public List<QuestionTest> getQuestionTests() {
		return questionTests;
	}

	public void setQuestionTests(List<QuestionTest> questionTests) {
		this.questionTests = questionTests;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}