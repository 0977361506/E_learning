package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date birthday;

	private String email;

	private long idPosition;

	private String idUnit;

	private String imageUsers;

	private Date lastUpdate;

	private String name_Users;

	private String passwordUsers;

	private String phoneNumber;

	private String place;

	private int sex;

	private int statusUsers;

	private Date timeCreate;

	//bi-directional many-to-one association to Candidate
	@OneToMany(mappedBy="user")
	private List<Candidate> candidates;

	//bi-directional many-to-one association to Certificatee
	@OneToMany(mappedBy="user")
	private List<Certificatee> certificatees;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="user")
	private List<Comment> comments;

	//bi-directional many-to-one association to CourseJoin
	@OneToMany(mappedBy="user")
	private List<CourseJoin> courseJoins;

	//bi-directional many-to-one association to Eventt
	@OneToMany(mappedBy="user")
	private List<Eventt> eventts;

	//bi-directional many-to-one association to Formemail
	@OneToMany(mappedBy="user")
	private List<Formemail> formemails;

	//bi-directional many-to-one association to FreedomLectureProcess
	@OneToMany(mappedBy="user")
	private List<FreedomLectureProcess> freedomLectureProcesses;

	//bi-directional many-to-one association to HomeWorkAnswer
	@OneToMany(mappedBy="user")
	private List<HomeWorkAnswer> homeWorkAnswers;

	//bi-directional many-to-one association to HomeWorkLectureProcess
	@OneToMany(mappedBy="user")
	private List<HomeWorkLectureProcess> homeWorkLectureProcesses;

	//bi-directional many-to-one association to InterActiveLectureprocess
	@OneToMany(mappedBy="user")
	private List<InterActiveLectureprocess> interActiveLectureprocesses;

	//bi-directional many-to-one association to New
	@OneToMany(mappedBy="user")
	private List<New> news;

	//bi-directional many-to-one association to PowerpointLectureProcess
	@OneToMany(mappedBy="user")
	private List<PowerpointLectureProcess> powerpointLectureProcesses;

	//bi-directional many-to-one association to Rate
	@OneToMany(mappedBy="user")
	private List<Rate> rates;

	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="user")
	private List<Result> results;

	//bi-directional many-to-one association to ScormLectureProcess
	@OneToMany(mappedBy="user")
	private List<ScormLectureProcess> scormLectureProcesses;

	//bi-directional many-to-one association to StatisticalAction
	@OneToMany(mappedBy="user")
	private List<StatisticalAction> statisticalActions;

	//bi-directional many-to-one association to StatisticalRoundTest
	@OneToMany(mappedBy="user")
	private List<StatisticalRoundTest> statisticalRoundTests;

	//bi-directional many-to-one association to Subject
	@OneToMany(mappedBy="user")
	private List<Subject> subjects;

	//bi-directional many-to-one association to Test
	@OneToMany(mappedBy="user")
	private List<Test> tests;

	//bi-directional many-to-one association to UserPermistion
	@OneToMany(mappedBy="user")
	private List<UserPermistion> userPermistions;

	//bi-directional many-to-one association to UserRoleCourse
	@OneToMany(mappedBy="user")
	private List<UserRoleCourse> userRoleCourses;

	//bi-directional many-to-one association to Ward
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idWard")
	private Ward ward;

	//bi-directional many-to-one association to VideoLectureProcess
	@OneToMany(mappedBy="user")
	private List<VideoLectureProcess> videoLectureProcesses;

	public User() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIdPosition() {
		return this.idPosition;
	}

	public void setIdPosition(long idPosition) {
		this.idPosition = idPosition;
	}

	public String getIdUnit() {
		return this.idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public String getImageUsers() {
		return this.imageUsers;
	}

	public void setImageUsers(String imageUsers) {
		this.imageUsers = imageUsers;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getName_Users() {
		return this.name_Users;
	}

	public void setName_Users(String name_Users) {
		this.name_Users = name_Users;
	}

	public String getPasswordUsers() {
		return this.passwordUsers;
	}

	public void setPasswordUsers(String passwordUsers) {
		this.passwordUsers = passwordUsers;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getStatusUsers() {
		return this.statusUsers;
	}

	public void setStatusUsers(int statusUsers) {
		this.statusUsers = statusUsers;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Candidate addCandidate(Candidate candidate) {
		getCandidates().add(candidate);
		candidate.setUser(this);

		return candidate;
	}

	public Candidate removeCandidate(Candidate candidate) {
		getCandidates().remove(candidate);
		candidate.setUser(null);

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
		certificatee.setUser(this);

		return certificatee;
	}

	public Certificatee removeCertificatee(Certificatee certificatee) {
		getCertificatees().remove(certificatee);
		certificatee.setUser(null);

		return certificatee;
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Comment addComment(Comment comment) {
		getComments().add(comment);
		comment.setUser(this);

		return comment;
	}

	public Comment removeComment(Comment comment) {
		getComments().remove(comment);
		comment.setUser(null);

		return comment;
	}

	public List<CourseJoin> getCourseJoins() {
		return this.courseJoins;
	}

	public void setCourseJoins(List<CourseJoin> courseJoins) {
		this.courseJoins = courseJoins;
	}

	public CourseJoin addCourseJoin(CourseJoin courseJoin) {
		getCourseJoins().add(courseJoin);
		courseJoin.setUser(this);

		return courseJoin;
	}

	public CourseJoin removeCourseJoin(CourseJoin courseJoin) {
		getCourseJoins().remove(courseJoin);
		courseJoin.setUser(null);

		return courseJoin;
	}

	public List<Eventt> getEventts() {
		return this.eventts;
	}

	public void setEventts(List<Eventt> eventts) {
		this.eventts = eventts;
	}

	public Eventt addEventt(Eventt eventt) {
		getEventts().add(eventt);
		eventt.setUser(this);

		return eventt;
	}

	public Eventt removeEventt(Eventt eventt) {
		getEventts().remove(eventt);
		eventt.setUser(null);

		return eventt;
	}

	public List<Formemail> getFormemails() {
		return this.formemails;
	}

	public void setFormemails(List<Formemail> formemails) {
		this.formemails = formemails;
	}

	public Formemail addFormemail(Formemail formemail) {
		getFormemails().add(formemail);
		formemail.setUser(this);

		return formemail;
	}

	public Formemail removeFormemail(Formemail formemail) {
		getFormemails().remove(formemail);
		formemail.setUser(null);

		return formemail;
	}

	public List<FreedomLectureProcess> getFreedomLectureProcesses() {
		return this.freedomLectureProcesses;
	}

	public void setFreedomLectureProcesses(List<FreedomLectureProcess> freedomLectureProcesses) {
		this.freedomLectureProcesses = freedomLectureProcesses;
	}

	public FreedomLectureProcess addFreedomLectureProcess(FreedomLectureProcess freedomLectureProcess) {
		getFreedomLectureProcesses().add(freedomLectureProcess);
		freedomLectureProcess.setUser(this);

		return freedomLectureProcess;
	}

	public FreedomLectureProcess removeFreedomLectureProcess(FreedomLectureProcess freedomLectureProcess) {
		getFreedomLectureProcesses().remove(freedomLectureProcess);
		freedomLectureProcess.setUser(null);

		return freedomLectureProcess;
	}

	public List<HomeWorkAnswer> getHomeWorkAnswers() {
		return this.homeWorkAnswers;
	}

	public void setHomeWorkAnswers(List<HomeWorkAnswer> homeWorkAnswers) {
		this.homeWorkAnswers = homeWorkAnswers;
	}

	public HomeWorkAnswer addHomeWorkAnswer(HomeWorkAnswer homeWorkAnswer) {
		getHomeWorkAnswers().add(homeWorkAnswer);
		homeWorkAnswer.setUser(this);

		return homeWorkAnswer;
	}

	public HomeWorkAnswer removeHomeWorkAnswer(HomeWorkAnswer homeWorkAnswer) {
		getHomeWorkAnswers().remove(homeWorkAnswer);
		homeWorkAnswer.setUser(null);

		return homeWorkAnswer;
	}

	public List<HomeWorkLectureProcess> getHomeWorkLectureProcesses() {
		return this.homeWorkLectureProcesses;
	}

	public void setHomeWorkLectureProcesses(List<HomeWorkLectureProcess> homeWorkLectureProcesses) {
		this.homeWorkLectureProcesses = homeWorkLectureProcesses;
	}

	public HomeWorkLectureProcess addHomeWorkLectureProcess(HomeWorkLectureProcess homeWorkLectureProcess) {
		getHomeWorkLectureProcesses().add(homeWorkLectureProcess);
		homeWorkLectureProcess.setUser(this);

		return homeWorkLectureProcess;
	}

	public HomeWorkLectureProcess removeHomeWorkLectureProcess(HomeWorkLectureProcess homeWorkLectureProcess) {
		getHomeWorkLectureProcesses().remove(homeWorkLectureProcess);
		homeWorkLectureProcess.setUser(null);

		return homeWorkLectureProcess;
	}

	public List<InterActiveLectureprocess> getInterActiveLectureprocesses() {
		return this.interActiveLectureprocesses;
	}

	public void setInterActiveLectureprocesses(List<InterActiveLectureprocess> interActiveLectureprocesses) {
		this.interActiveLectureprocesses = interActiveLectureprocesses;
	}

	public InterActiveLectureprocess addInterActiveLectureprocess(InterActiveLectureprocess interActiveLectureprocess) {
		getInterActiveLectureprocesses().add(interActiveLectureprocess);
		interActiveLectureprocess.setUser(this);

		return interActiveLectureprocess;
	}

	public InterActiveLectureprocess removeInterActiveLectureprocess(InterActiveLectureprocess interActiveLectureprocess) {
		getInterActiveLectureprocesses().remove(interActiveLectureprocess);
		interActiveLectureprocess.setUser(null);

		return interActiveLectureprocess;
	}

	public List<New> getNews() {
		return this.news;
	}

	public void setNews(List<New> news) {
		this.news = news;
	}


	public List<PowerpointLectureProcess> getPowerpointLectureProcesses() {
		return this.powerpointLectureProcesses;
	}

	public void setPowerpointLectureProcesses(List<PowerpointLectureProcess> powerpointLectureProcesses) {
		this.powerpointLectureProcesses = powerpointLectureProcesses;
	}

	public PowerpointLectureProcess addPowerpointLectureProcess(PowerpointLectureProcess powerpointLectureProcess) {
		getPowerpointLectureProcesses().add(powerpointLectureProcess);
		powerpointLectureProcess.setUser(this);

		return powerpointLectureProcess;
	}

	public PowerpointLectureProcess removePowerpointLectureProcess(PowerpointLectureProcess powerpointLectureProcess) {
		getPowerpointLectureProcesses().remove(powerpointLectureProcess);
		powerpointLectureProcess.setUser(null);

		return powerpointLectureProcess;
	}

	public List<Rate> getRates() {
		return this.rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public Rate addRate(Rate rate) {
		getRates().add(rate);
		rate.setUser(this);

		return rate;
	}

	public Rate removeRate(Rate rate) {
		getRates().remove(rate);
		rate.setUser(null);

		return rate;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Result addResult(Result result) {
		getResults().add(result);
		result.setUser(this);

		return result;
	}

	public Result removeResult(Result result) {
		getResults().remove(result);
		result.setUser(null);

		return result;
	}

	public List<ScormLectureProcess> getScormLectureProcesses() {
		return this.scormLectureProcesses;
	}

	public void setScormLectureProcesses(List<ScormLectureProcess> scormLectureProcesses) {
		this.scormLectureProcesses = scormLectureProcesses;
	}

	public ScormLectureProcess addScormLectureProcess(ScormLectureProcess scormLectureProcess) {
		getScormLectureProcesses().add(scormLectureProcess);
		scormLectureProcess.setUser(this);

		return scormLectureProcess;
	}

	public ScormLectureProcess removeScormLectureProcess(ScormLectureProcess scormLectureProcess) {
		getScormLectureProcesses().remove(scormLectureProcess);
		scormLectureProcess.setUser(null);

		return scormLectureProcess;
	}

	public List<StatisticalAction> getStatisticalActions() {
		return this.statisticalActions;
	}

	public void setStatisticalActions(List<StatisticalAction> statisticalActions) {
		this.statisticalActions = statisticalActions;
	}

	public StatisticalAction addStatisticalAction(StatisticalAction statisticalAction) {
		getStatisticalActions().add(statisticalAction);
		statisticalAction.setUser(this);

		return statisticalAction;
	}

	public StatisticalAction removeStatisticalAction(StatisticalAction statisticalAction) {
		getStatisticalActions().remove(statisticalAction);
		statisticalAction.setUser(null);

		return statisticalAction;
	}

	public List<StatisticalRoundTest> getStatisticalRoundTests() {
		return this.statisticalRoundTests;
	}

	public void setStatisticalRoundTests(List<StatisticalRoundTest> statisticalRoundTests) {
		this.statisticalRoundTests = statisticalRoundTests;
	}

	public StatisticalRoundTest addStatisticalRoundTest(StatisticalRoundTest statisticalRoundTest) {
		getStatisticalRoundTests().add(statisticalRoundTest);
		statisticalRoundTest.setUser(this);

		return statisticalRoundTest;
	}

	public StatisticalRoundTest removeStatisticalRoundTest(StatisticalRoundTest statisticalRoundTest) {
		getStatisticalRoundTests().remove(statisticalRoundTest);
		statisticalRoundTest.setUser(null);

		return statisticalRoundTest;
	}

	public List<Subject> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Subject addSubject(Subject subject) {
		getSubjects().add(subject);
		subject.setUser(this);

		return subject;
	}

	public Subject removeSubject(Subject subject) {
		getSubjects().remove(subject);
		subject.setUser(null);

		return subject;
	}

	public List<Test> getTests() {
		return this.tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public Test addTest(Test test) {
		getTests().add(test);
		test.setUser(this);

		return test;
	}

	public Test removeTest(Test test) {
		getTests().remove(test);
		test.setUser(null);

		return test;
	}

	public List<UserPermistion> getUserPermistions() {
		return this.userPermistions;
	}

	public void setUserPermistions(List<UserPermistion> userPermistions) {
		this.userPermistions = userPermistions;
	}

	public UserPermistion addUserPermistion(UserPermistion userPermistion) {
		getUserPermistions().add(userPermistion);
		userPermistion.setUser(this);

		return userPermistion;
	}

	public UserPermistion removeUserPermistion(UserPermistion userPermistion) {
		getUserPermistions().remove(userPermistion);
		userPermistion.setUser(null);

		return userPermistion;
	}

	public List<UserRoleCourse> getUserRoleCourses() {
		return this.userRoleCourses;
	}

	public void setUserRoleCourses(List<UserRoleCourse> userRoleCourses) {
		this.userRoleCourses = userRoleCourses;
	}

	public UserRoleCourse addUserRoleCours(UserRoleCourse userRoleCours) {
		getUserRoleCourses().add(userRoleCours);
		userRoleCours.setUser(this);

		return userRoleCours;
	}

	public UserRoleCourse removeUserRoleCours(UserRoleCourse userRoleCours) {
		getUserRoleCourses().remove(userRoleCours);
		userRoleCours.setUser(null);

		return userRoleCours;
	}

	public Ward getWard() {
		return this.ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public List<VideoLectureProcess> getVideoLectureProcesses() {
		return this.videoLectureProcesses;
	}

	public void setVideoLectureProcesses(List<VideoLectureProcess> videoLectureProcesses) {
		this.videoLectureProcesses = videoLectureProcesses;
	}

	public VideoLectureProcess addVideoLectureProcess(VideoLectureProcess videoLectureProcess) {
		getVideoLectureProcesses().add(videoLectureProcess);
		videoLectureProcess.setUser(this);

		return videoLectureProcess;
	}

	public VideoLectureProcess removeVideoLectureProcess(VideoLectureProcess videoLectureProcess) {
		getVideoLectureProcesses().remove(videoLectureProcess);
		videoLectureProcess.setUser(null);

		return videoLectureProcess;
	}

}