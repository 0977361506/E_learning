package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the RoundTest database table.
 * 
 */
@Entity
@Table(name = "RoundTest")

public class RoundTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int autoCreateQuestion;

	private String codeRoundTest;

	@Lob
	private String describes;

	private int doAgain;

	private int fullTickAnswer;

	private int giveCertificate;

	private String idUnit;

	private Date lastUpdate;

	private int maxPoint;

	private int maxWork;

	private int minPoint;

	private int mixAnswer;

	private String nameRound;

	private int showResutl;

	private int sourceQuestion;

	private int statusRound;

	private Date timeCreate;

	private Date timeEnd;

	private Date timeRound;

	private Date timeStart;

	//bi-directional many-to-one association to AddPoint
	@OneToMany(mappedBy="roundTest")
	private List<AddPoint> addPoints;

	//bi-directional many-to-one association to Candidate
	@OneToMany(mappedBy="roundTest")
	private List<Candidate> candidates;

	//bi-directional many-to-one association to Certificatee
	@OneToMany(mappedBy="roundTest")
	private List<Certificatee> certificatees;

	//bi-directional many-to-one association to GroupTest
	@OneToMany(mappedBy="roundTest")
	private List<GroupTest> groupTests;

	//bi-directional many-to-one association to QuestionRoundTest
	@OneToMany(mappedBy="roundTest")
	private List<QuestionRoundTest> questionRoundTests;

	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="roundTest")
	private List<Result> results;

	//bi-directional many-to-one association to Competition
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCompetition")
	private Competition competition;

	//bi-directional many-to-one association to Condition
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCondition")
	private Condition condition;

	//bi-directional many-to-one association to MixCompetition
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMixCompettion")
	private MixCompetition mixCompetition;

	//bi-directional many-to-one association to StructTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idStructTest")
	private StructTest structTest;

	//bi-directional many-to-one association to SourceQuestion
	@OneToMany(mappedBy="roundTest")
	private List<SourceQuestion> sourceQuestions;

	//bi-directional many-to-one association to StatisticalRoundTest
	@OneToMany(mappedBy="roundTest")
	private List<StatisticalRoundTest> statisticalRoundTests;

	//bi-directional many-to-one association to SubPoint
	@OneToMany(mappedBy="roundTest")
	private List<SubPoint> subPoints;

	public RoundTest() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAutoCreateQuestion() {
		return this.autoCreateQuestion;
	}

	public void setAutoCreateQuestion(int autoCreateQuestion) {
		this.autoCreateQuestion = autoCreateQuestion;
	}

	public String getCodeRoundTest() {
		return this.codeRoundTest;
	}

	public void setCodeRoundTest(String codeRoundTest) {
		this.codeRoundTest = codeRoundTest;
	}

	public String getDescribes() {
		return this.describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public int getDoAgain() {
		return this.doAgain;
	}

	public void setDoAgain(int doAgain) {
		this.doAgain = doAgain;
	}

	public int getFullTickAnswer() {
		return this.fullTickAnswer;
	}

	public void setFullTickAnswer(int fullTickAnswer) {
		this.fullTickAnswer = fullTickAnswer;
	}

	public int getGiveCertificate() {
		return this.giveCertificate;
	}

	public void setGiveCertificate(int giveCertificate) {
		this.giveCertificate = giveCertificate;
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

	public int getMaxPoint() {
		return this.maxPoint;
	}

	public void setMaxPoint(int maxPoint) {
		this.maxPoint = maxPoint;
	}

	public int getMaxWork() {
		return this.maxWork;
	}

	public void setMaxWork(int maxWork) {
		this.maxWork = maxWork;
	}

	public int getMinPoint() {
		return this.minPoint;
	}

	public void setMinPoint(int minPoint) {
		this.minPoint = minPoint;
	}

	public int getMixAnswer() {
		return this.mixAnswer;
	}

	public void setMixAnswer(int mixAnswer) {
		this.mixAnswer = mixAnswer;
	}

	public String getNameRound() {
		return this.nameRound;
	}

	public void setNameRound(String nameRound) {
		this.nameRound = nameRound;
	}

	public int getShowResutl() {
		return this.showResutl;
	}

	public void setShowResutl(int showResutl) {
		this.showResutl = showResutl;
	}

	public int getSourceQuestion() {
		return this.sourceQuestion;
	}

	public void setSourceQuestion(int sourceQuestion) {
		this.sourceQuestion = sourceQuestion;
	}

	public int getStatusRound() {
		return this.statusRound;
	}

	public void setStatusRound(int statusRound) {
		this.statusRound = statusRound;
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

	public Date getTimeRound() {
		return this.timeRound;
	}

	public void setTimeRound(Date timeRound) {
		this.timeRound = timeRound;
	}

	public Date getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public List<AddPoint> getAddPoints() {
		return this.addPoints;
	}

	public void setAddPoints(List<AddPoint> addPoints) {
		this.addPoints = addPoints;
	}

	public AddPoint addAddPoint(AddPoint addPoint) {
		getAddPoints().add(addPoint);
		addPoint.setRoundTest(this);

		return addPoint;
	}

	public AddPoint removeAddPoint(AddPoint addPoint) {
		getAddPoints().remove(addPoint);
		addPoint.setRoundTest(null);

		return addPoint;
	}

	public List<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Candidate addCandidate(Candidate candidate) {
		getCandidates().add(candidate);
		candidate.setRoundTest(this);

		return candidate;
	}

	public Candidate removeCandidate(Candidate candidate) {
		getCandidates().remove(candidate);
		candidate.setRoundTest(null);

		return candidate;
	}

	public List<Certificatee> getCertificatees() {
		return this.certificatees;
	}

	public void setCertificatees(List<Certificatee> certificatees) {
		this.certificatees = certificatees;
	}

	public Certificatee addCertificatee(Certificatee certificatee) {
		getCertificatees().add(certificatee);
		certificatee.setRoundTest(this);

		return certificatee;
	}

	public Certificatee removeCertificatee(Certificatee certificatee) {
		getCertificatees().remove(certificatee);
		certificatee.setRoundTest(null);

		return certificatee;
	}

	public List<GroupTest> getGroupTests() {
		return this.groupTests;
	}

	public void setGroupTests(List<GroupTest> groupTests) {
		this.groupTests = groupTests;
	}

	public GroupTest addGroupTest(GroupTest groupTest) {
		getGroupTests().add(groupTest);
		groupTest.setRoundTest(this);

		return groupTest;
	}

	public GroupTest removeGroupTest(GroupTest groupTest) {
		getGroupTests().remove(groupTest);
		groupTest.setRoundTest(null);

		return groupTest;
	}

	public List<QuestionRoundTest> getQuestionRoundTests() {
		return this.questionRoundTests;
	}

	public void setQuestionRoundTests(List<QuestionRoundTest> questionRoundTests) {
		this.questionRoundTests = questionRoundTests;
	}

	public QuestionRoundTest addQuestionRoundTest(QuestionRoundTest questionRoundTest) {
		getQuestionRoundTests().add(questionRoundTest);
		questionRoundTest.setRoundTest(this);

		return questionRoundTest;
	}

	public QuestionRoundTest removeQuestionRoundTest(QuestionRoundTest questionRoundTest) {
		getQuestionRoundTests().remove(questionRoundTest);
		questionRoundTest.setRoundTest(null);

		return questionRoundTest;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Result addResult(Result result) {
		getResults().add(result);
		result.setRoundTest(this);

		return result;
	}

	public Result removeResult(Result result) {
		getResults().remove(result);
		result.setRoundTest(null);

		return result;
	}

	public Competition getCompetition() {
		return this.competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public MixCompetition getMixCompetition() {
		return this.mixCompetition;
	}

	public void setMixCompetition(MixCompetition mixCompetition) {
		this.mixCompetition = mixCompetition;
	}

	public StructTest getStructTest() {
		return this.structTest;
	}

	public void setStructTest(StructTest structTest) {
		this.structTest = structTest;
	}

	public List<SourceQuestion> getSourceQuestions() {
		return this.sourceQuestions;
	}

	public void setSourceQuestions(List<SourceQuestion> sourceQuestions) {
		this.sourceQuestions = sourceQuestions;
	}

	public SourceQuestion addSourceQuestion(SourceQuestion sourceQuestion) {
		getSourceQuestions().add(sourceQuestion);
		sourceQuestion.setRoundTest(this);

		return sourceQuestion;
	}

	public SourceQuestion removeSourceQuestion(SourceQuestion sourceQuestion) {
		getSourceQuestions().remove(sourceQuestion);
		sourceQuestion.setRoundTest(null);

		return sourceQuestion;
	}

	public List<StatisticalRoundTest> getStatisticalRoundTests() {
		return this.statisticalRoundTests;
	}

	public void setStatisticalRoundTests(List<StatisticalRoundTest> statisticalRoundTests) {
		this.statisticalRoundTests = statisticalRoundTests;
	}

	public StatisticalRoundTest addStatisticalRoundTest(StatisticalRoundTest statisticalRoundTest) {
		getStatisticalRoundTests().add(statisticalRoundTest);
		statisticalRoundTest.setRoundTest(this);

		return statisticalRoundTest;
	}

	public StatisticalRoundTest removeStatisticalRoundTest(StatisticalRoundTest statisticalRoundTest) {
		getStatisticalRoundTests().remove(statisticalRoundTest);
		statisticalRoundTest.setRoundTest(null);

		return statisticalRoundTest;
	}

	public List<SubPoint> getSubPoints() {
		return this.subPoints;
	}

	public void setSubPoints(List<SubPoint> subPoints) {
		this.subPoints = subPoints;
	}

	public SubPoint addSubPoint(SubPoint subPoint) {
		getSubPoints().add(subPoint);
		subPoint.setRoundTest(this);

		return subPoint;
	}

	public SubPoint removeSubPoint(SubPoint subPoint) {
		getSubPoints().remove(subPoint);
		subPoint.setRoundTest(null);

		return subPoint;
	}

}