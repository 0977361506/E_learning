package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ChapterVideoLecture database table.
 * 
 */
@Entity
@Table(name = "ChapterVideoLecture")

public class ChapterVideoLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChapterVideoLecturePK id;

	private int position;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter",insertable = false, updatable = false)
	private Chapter chapter;

	//bi-directional many-to-one association to VideoLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idVideoLecture",insertable = false, updatable = false)
	private VideoLecture videoLecture;

	public ChapterVideoLecture() {
	}

	public ChapterVideoLecturePK getId() {
		return this.id;
	}

	public void setId(ChapterVideoLecturePK id) {
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

	public VideoLecture getVideoLecture() {
		return this.videoLecture;
	}

	public void setVideoLecture(VideoLecture videoLecture) {
		this.videoLecture = videoLecture;
	}

}