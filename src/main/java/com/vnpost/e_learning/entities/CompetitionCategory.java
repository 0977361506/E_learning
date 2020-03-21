package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CompetitionCategory database table.
 * 
 */
@Entity
@Table(name ="CompetitionCategory" )

public class CompetitionCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String describes;

	private Timestamp lastUpdate;

	private String nameCompetition;

	private Date timeCreate;

	//bi-directional many-to-one association to Competition
	@OneToMany(mappedBy="competitionCategory")
	private List<Competition> competitions;

	//bi-directional many-to-one association to TreeCompetition
	@OneToMany(mappedBy="competitionCategory1")
	private List<TreeCompetition> treeCompetitions1;

	//bi-directional many-to-one association to TreeCompetition
	@OneToMany(mappedBy="competitionCategory2")
	private List<TreeCompetition> treeCompetitions2;

	public CompetitionCategory() {
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

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameCompetition() {
		return nameCompetition;
	}

	public void setNameCompetition(String nameCompetition) {
		this.nameCompetition = nameCompetition;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(List<Competition> competitions) {
		this.competitions = competitions;
	}

	public List<TreeCompetition> getTreeCompetitions1() {
		return treeCompetitions1;
	}

	public void setTreeCompetitions1(List<TreeCompetition> treeCompetitions1) {
		this.treeCompetitions1 = treeCompetitions1;
	}

	public List<TreeCompetition> getTreeCompetitions2() {
		return treeCompetitions2;
	}

	public void setTreeCompetitions2(List<TreeCompetition> treeCompetitions2) {
		this.treeCompetitions2 = treeCompetitions2;
	}

	
}