package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PowerpointLectureProcess database table.
 * 
 */
@Entity
@Table(name = "PowerpointLectureProcess")

public class PowerpointLectureProcess implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int lastView;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter")
	private Chapter chapter;

	//bi-directional many-to-one association to PowerpointLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPowerpointLecture")
	private PowerpointLecture powerpointLecture;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public PowerpointLectureProcess() {
	}

	public int getLastView() {
		return this.lastView;
	}

	public void setLastView(int lastView) {
		this.lastView = lastView;
	}

	public Chapter getChapter() {
		return this.chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public PowerpointLecture getPowerpointLecture() {
		return this.powerpointLecture;
	}

	public void setPowerpointLecture(PowerpointLecture powerpointLecture) {
		this.powerpointLecture = powerpointLecture;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}