package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the InterActiveLecture database table.
 * 
 */
@Entity
@Table(name = "InterActiveLecture")

public class InterActiveLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String contents;

	private String createdBy;

	private Date createdDate;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	private int status;

	private int stored;

	//bi-directional many-to-one association to CourseWare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseWare")
	private CourseWare courseWare;

	//bi-directional many-to-one association to InterActiveLectureChapter
	@OneToMany(mappedBy="interActiveLecture")
	private List<InterActiveLectureChapter> interActiveLectureChapters;

	//bi-directional many-to-one association to InterActiveLectureprocess
	@OneToMany(mappedBy="interActiveLecture")
	private List<InterActiveLectureprocess> interActiveLectureprocesses;

	public InterActiveLecture() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStored() {
		return stored;
	}

	public void setStored(int stored) {
		this.stored = stored;
	}

	public CourseWare getCourseWare() {
		return courseWare;
	}

	public void setCourseWare(CourseWare courseWare) {
		this.courseWare = courseWare;
	}

	public List<InterActiveLectureChapter> getInterActiveLectureChapters() {
		return interActiveLectureChapters;
	}

	public void setInterActiveLectureChapters(List<InterActiveLectureChapter> interActiveLectureChapters) {
		this.interActiveLectureChapters = interActiveLectureChapters;
	}

	public List<InterActiveLectureprocess> getInterActiveLectureprocesses() {
		return interActiveLectureprocesses;
	}

	public void setInterActiveLectureprocesses(List<InterActiveLectureprocess> interActiveLectureprocesses) {
		this.interActiveLectureprocesses = interActiveLectureprocesses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}