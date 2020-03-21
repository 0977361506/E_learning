package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the Candidates database table.
 * 
 */
@Entity
@Table(name="Candidates")

public class Candidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private Date lastUpdate;

	private int statusCandidates;

	private Date timeCreate;

	//bi-directional many-to-one association to GroupTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idGroupTest")
	private GroupTest groupTest;

	//bi-directional many-to-one association to RoundTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRoundTest")
	private RoundTest roundTest;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public Candidate() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getStatusCandidates() {
		return statusCandidates;
	}

	public void setStatusCandidates(int statusCandidates) {
		this.statusCandidates = statusCandidates;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public GroupTest getGroupTest() {
		return groupTest;
	}

	public void setGroupTest(GroupTest groupTest) {
		this.groupTest = groupTest;
	}

	public RoundTest getRoundTest() {
		return roundTest;
	}

	public void setRoundTest(RoundTest roundTest) {
		this.roundTest = roundTest;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}