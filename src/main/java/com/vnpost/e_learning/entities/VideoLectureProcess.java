package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the VideoLectureProcess database table.
 * 
 */
@Entity
@Table(name = "VideoLectureProcess")

public class VideoLectureProcess implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	private String createdBy;

	private Date createdDate;

	private int finished;

	private int lasttimeview;

	private String modifiedBy;

	private Date modifiedDate;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter")
	private Chapter chapter;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	//bi-directional many-to-one association to VideoLecture
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idVideoLecture")
	private VideoLecture videoLecture;

	public VideoLectureProcess() {
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getFinished() {
		return this.finished;
	}

	public void setFinished(int finished) {
		this.finished = finished;
	}

	public int getLasttimeview() {
		return this.lasttimeview;
	}

	public void setLasttimeview(int lasttimeview) {
		this.lasttimeview = lasttimeview;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Chapter getChapter() {
		return this.chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public VideoLecture getVideoLecture() {
		return this.videoLecture;
	}

	public void setVideoLecture(VideoLecture videoLecture) {
		this.videoLecture = videoLecture;
	}

}