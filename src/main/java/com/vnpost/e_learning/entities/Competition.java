package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Competition database table.
 * 
 */
@Entity
@Table(name = "Competition")

public class Competition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String describe;

	private String idUnit;

	private String imageCompetition;

	private Timestamp lastUpdate;

	private String nameCompetition;

	private int statusCompetition;

	private Date timeCreate;

	private Date timeEnd;

	private Date timeStart;

	//bi-directional many-to-one association to CompetitionCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCompetitionCategory")
	private CompetitionCategory competitionCategory;

	//bi-directional many-to-one association to RequirementTest
	@OneToMany(mappedBy="competition")
	private List<RequirementTest> requirementTests;

	//bi-directional many-to-one association to RoundTest
	@OneToMany(mappedBy="competition")
	private List<RoundTest> roundTests;

	public Competition() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getIdUnit() {
		return this.idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public String getImageCompetition() {
		return this.imageCompetition;
	}

	public void setImageCompetition(String imageCompetition) {
		this.imageCompetition = imageCompetition;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameCompetition() {
		return this.nameCompetition;
	}

	public void setNameCompetition(String nameCompetition) {
		this.nameCompetition = nameCompetition;
	}

	public int getStatusCompetition() {
		return this.statusCompetition;
	}

	public void setStatusCompetition(int statusCompetition) {
		this.statusCompetition = statusCompetition;
	}

	

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public CompetitionCategory getCompetitionCategory() {
		return this.competitionCategory;
	}

	public void setCompetitionCategory(CompetitionCategory competitionCategory) {
		this.competitionCategory = competitionCategory;
	}

	public List<RequirementTest> getRequirementTests() {
		return this.requirementTests;
	}

	public void setRequirementTests(List<RequirementTest> requirementTests) {
		this.requirementTests = requirementTests;
	}

	public RequirementTest addRequirementTest(RequirementTest requirementTest) {
		getRequirementTests().add(requirementTest);
		requirementTest.setCompetition(this);

		return requirementTest;
	}

	public RequirementTest removeRequirementTest(RequirementTest requirementTest) {
		getRequirementTests().remove(requirementTest);
		requirementTest.setCompetition(null);

		return requirementTest;
	}

	public List<RoundTest> getRoundTests() {
		return this.roundTests;
	}

	public void setRoundTests(List<RoundTest> roundTests) {
		this.roundTests = roundTests;
	}

	public RoundTest addRoundTest(RoundTest roundTest) {
		getRoundTests().add(roundTest);
		roundTest.setCompetition(this);

		return roundTest;
	}

	public RoundTest removeRoundTest(RoundTest roundTest) {
		getRoundTests().remove(roundTest);
		roundTest.setCompetition(null);

		return roundTest;
	}

}