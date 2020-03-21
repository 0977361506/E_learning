package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the MixCompetition database table.
 * 
 */
@Entity
@Table(name = "MixCompetition")

public class MixCompetition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String nameMix;

	//bi-directional many-to-one association to RoundTest
	@OneToMany(mappedBy="mixCompetition")
	private List<RoundTest> roundTests;

	public MixCompetition() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameMix() {
		return this.nameMix;
	}

	public void setNameMix(String nameMix) {
		this.nameMix = nameMix;
	}

	public List<RoundTest> getRoundTests() {
		return this.roundTests;
	}

	public void setRoundTests(List<RoundTest> roundTests) {
		this.roundTests = roundTests;
	}

	public RoundTest addRoundTest(RoundTest roundTest) {
		getRoundTests().add(roundTest);
		roundTest.setMixCompetition(this);

		return roundTest;
	}

	public RoundTest removeRoundTest(RoundTest roundTest) {
		getRoundTests().remove(roundTest);
		roundTest.setMixCompetition(null);

		return roundTest;
	}

}