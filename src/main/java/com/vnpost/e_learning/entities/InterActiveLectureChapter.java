package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the InterActiveLectureChapter database table.
 * 
 */
@Entity
@Table(name = "InterActiveLectureChapter")

public class InterActiveLectureChapter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InterActiveLectureChapterPK id;

	private int position;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter;

	//bi-directional many-to-one association to InterActiveLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idInterActiveLecture",insertable = false, updatable = false)
	private InterActiveLecture interActiveLecture;

	public InterActiveLectureChapter() {
	}

	public InterActiveLectureChapterPK getId() {
		return this.id;
	}

	public void setId(InterActiveLectureChapterPK id) {
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

	public InterActiveLecture getInterActiveLecture() {
		return this.interActiveLecture;
	}

	public void setInterActiveLecture(InterActiveLecture interActiveLecture) {
		this.interActiveLecture = interActiveLecture;
	}

}