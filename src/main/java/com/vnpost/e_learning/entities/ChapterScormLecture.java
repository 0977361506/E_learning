package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ChapterScormLecture database table.
 * 
 */
@Entity
@Table(name = "ChapterScormLecture")

public class ChapterScormLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChapterScormLecturePK id;

	private int position;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter;

	//bi-directional many-to-one association to ScormLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idScormLecture",insertable = false, updatable = false)
	private ScormLecture scormLecture;

	public ChapterScormLecture() {
	}

	public ChapterScormLecturePK getId() {
		return this.id;
	}

	public void setId(ChapterScormLecturePK id) {
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

	public ScormLecture getScormLecture() {
		return this.scormLecture;
	}

	public void setScormLecture(ScormLecture scormLecture) {
		this.scormLecture = scormLecture;
	}

}