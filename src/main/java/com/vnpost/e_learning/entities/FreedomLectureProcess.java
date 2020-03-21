package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FreedomLectureProcess database table.
 * 
 */
@Entity
@Table(name = "FreedomLectureProcess")

public class FreedomLectureProcess implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    Integer id ;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private int timeLearn;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter")
	private Chapter chapter1;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter2;

	//bi-directional many-to-one association to FreedomLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idFreedomLecture")
	private FreedomLecture freedomLecture;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public FreedomLectureProcess() {
	}

	public int getTimeLearn() {
		return this.timeLearn;
	}

	public void setTimeLearn(int timeLearn) {
		this.timeLearn = timeLearn;
	}

	public Chapter getChapter1() {
		return this.chapter1;
	}

	public void setChapter1(Chapter chapter1) {
		this.chapter1 = chapter1;
	}

	public Chapter getChapter2() {
		return this.chapter2;
	}

	public void setChapter2(Chapter chapter2) {
		this.chapter2 = chapter2;
	}

	public FreedomLecture getFreedomLecture() {
		return this.freedomLecture;
	}

	public void setFreedomLecture(FreedomLecture freedomLecture) {
		this.freedomLecture = freedomLecture;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}