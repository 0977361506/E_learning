package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ChapterPowerpointlecture database table.
 * 
 */
@Entity
@Table(name = "ChapterPowerpointlecture")

public class ChapterPowerpointlecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChapterPowerpointlecturePK id;

	private int position;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter;

	//bi-directional many-to-one association to PowerpointLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPowerpointLecture",insertable = false, updatable = false)
	private PowerpointLecture powerpointLecture;

	public ChapterPowerpointlecture() {
	}

	public ChapterPowerpointlecturePK getId() {
		return this.id;
	}

	public void setId(ChapterPowerpointlecturePK id) {
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

	public PowerpointLecture getPowerpointLecture() {
		return this.powerpointLecture;
	}

	public void setPowerpointLecture(PowerpointLecture powerpointLecture) {
		this.powerpointLecture = powerpointLecture;
	}

}