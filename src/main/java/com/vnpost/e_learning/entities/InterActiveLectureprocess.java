package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the InterActiveLectureprocess database table.
 * 
 */
@Entity
@Table(name = "InterActiveLectureprocess")

public class InterActiveLectureprocess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String comments;

	private String contents;

	private int status;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter")
	private Chapter chapter;

	//bi-directional many-to-one association to InterActiveLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idInterActiveLecture")
	private InterActiveLecture interActiveLecture;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public InterActiveLectureprocess() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Chapter getChapter() {
		return this.chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public InterActiveLecture getInterActiveLecture() {
		return this.interActiveLecture;
	}

	public void setInterActiveLecture(InterActiveLecture interActiveLecture) {
		this.interActiveLecture = interActiveLecture;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}