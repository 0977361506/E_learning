package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the HomeWorkLectureProcess database table.
 * 
 */
@Entity
@Table(name = "HomeWorkLectureProcess")

public class HomeWorkLectureProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String createdBy;

	private Date createdDate;

	private String modifiedBy;

	private Date modifiedDate;

	private int score;

	private int status;

	//bi-directional many-to-one association to HomeWorkAnswer
	@OneToMany(mappedBy="homeWorkLectureProcess")
	private List<HomeWorkAnswer> homeWorkAnswers;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter")
	private Chapter chapter;

	//bi-directional many-to-one association to HomeWork
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idHomeWork")
	private HomeWork homeWork;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public HomeWorkLectureProcess() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<HomeWorkAnswer> getHomeWorkAnswers() {
		return homeWorkAnswers;
	}

	public void setHomeWorkAnswers(List<HomeWorkAnswer> homeWorkAnswers) {
		this.homeWorkAnswers = homeWorkAnswers;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public HomeWork getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(HomeWork homeWork) {
		this.homeWork = homeWork;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}