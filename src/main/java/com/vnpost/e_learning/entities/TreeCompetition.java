package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreeCompetition database table.
 * 
 */
@Entity
@Table(name = "TreeCompetition")

public class TreeCompetition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to CompetitionCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCompetitionCategoryOne")
	private CompetitionCategory competitionCategory1;

	//bi-directional many-to-one association to CompetitionCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCompetitionCategoryTwo")
	private CompetitionCategory competitionCategory2;

	public TreeCompetition() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public CompetitionCategory getCompetitionCategory1() {
		return this.competitionCategory1;
	}

	public void setCompetitionCategory1(CompetitionCategory competitionCategory1) {
		this.competitionCategory1 = competitionCategory1;
	}

	public CompetitionCategory getCompetitionCategory2() {
		return this.competitionCategory2;
	}

	public void setCompetitionCategory2(CompetitionCategory competitionCategory2) {
		this.competitionCategory2 = competitionCategory2;
	}

}