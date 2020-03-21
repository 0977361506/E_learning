package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ChapterHomeWork database table.
 * 
 */
@Entity
@Table(name = "ChapterHomeWork")
public class ChapterHomeWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChapterHomeWorkPK id;

	private int position;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter;

	//bi-directional many-to-one association to HomeWork
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idHomeWork",insertable = false, updatable = false)
	private HomeWork homeWork;

	public ChapterHomeWork() {
	}

	public ChapterHomeWorkPK getId() {
		return this.id;
	}

	public void setId(ChapterHomeWorkPK id) {
		this.id = id;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Chapter getChapter() {
		return this.chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public HomeWork getHomeWork() {
		return this.homeWork;
	}

	public void setHomeWork(HomeWork homeWork) {
		this.homeWork = homeWork;
	}

}