package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the GroupTest database table.
 * 
 */
@Entity
@Table(name = "GroupTest")

public class GroupTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String nameGroup;

	//bi-directional many-to-one association to Candidate
	@OneToMany(mappedBy="groupTest")
	private List<Candidate> candidates;

	//bi-directional many-to-one association to RoundTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRoundTest")
	private RoundTest roundTest;

	public GroupTest() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameGroup() {
		return this.nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public List<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Candidate addCandidate(Candidate candidate) {
		getCandidates().add(candidate);
		candidate.setGroupTest(this);

		return candidate;
	}

	public Candidate removeCandidate(Candidate candidate) {
		getCandidates().remove(candidate);
		candidate.setGroupTest(null);

		return candidate;
	}

	public RoundTest getRoundTest() {
		return this.roundTest;
	}

	public void setRoundTest(RoundTest roundTest) {
		this.roundTest = roundTest;
	}

}