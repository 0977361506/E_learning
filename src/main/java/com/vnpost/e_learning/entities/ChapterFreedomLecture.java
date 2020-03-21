package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ChapterFreedomLecture database table.
 * 
 */
@Entity
@Table(name = "ChapterFreedomLecture")

public class ChapterFreedomLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChapterFreedomLecturePK id;

	private int position;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter;

	//bi-directional many-to-one association to FreedomLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idFreedomLecture",insertable = false, updatable = false)
	private FreedomLecture freedomLecture;

	public ChapterFreedomLecture() {
	}

	public ChapterFreedomLecturePK getId() {
		return this.id;
	}

	public void setId(ChapterFreedomLecturePK id) {
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

	public FreedomLecture getFreedomLecture() {
		return this.freedomLecture;
	}

	public void setFreedomLecture(FreedomLecture freedomLecture) {
		this.freedomLecture = freedomLecture;
	}

}