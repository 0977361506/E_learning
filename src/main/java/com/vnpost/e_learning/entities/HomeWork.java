package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the HomeWork database table.
 * 
 */
@Entity
@Table(name = "HomeWork")

public class HomeWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String contents;

	private String createdBy;

	private Date createdDate;

	private String description;

	private Date ends;

	private String files;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	private int shared;

	private Date starts;

	private int status;

	private int stored;

	//bi-directional many-to-one association to ChapterHomeWork
	@OneToMany(mappedBy="homeWork")
	private List<ChapterHomeWork> chapterHomeWorks;

	//bi-directional many-to-one association to CourseWare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseWare")
	private CourseWare courseWare;

	//bi-directional many-to-one association to HomeWorkLectureProcess
	@OneToMany(mappedBy="homeWork")
	private List<HomeWorkLectureProcess> homeWorkLectureProcesses;

	public HomeWork() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEnds() {
		return ends;
	}

	public void setEnds(Date ends) {
		this.ends = ends;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
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

	public int getShared() {
		return shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public Date getStarts() {
		return starts;
	}

	public void setStarts(Date starts) {
		this.starts = starts;
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

	public List<ChapterHomeWork> getChapterHomeWorks() {
		return chapterHomeWorks;
	}

	public void setChapterHomeWorks(List<ChapterHomeWork> chapterHomeWorks) {
		this.chapterHomeWorks = chapterHomeWorks;
	}

	public CourseWare getCourseWare() {
		return courseWare;
	}

	public void setCourseWare(CourseWare courseWare) {
		this.courseWare = courseWare;
	}

	public List<HomeWorkLectureProcess> getHomeWorkLectureProcesses() {
		return homeWorkLectureProcesses;
	}

	public void setHomeWorkLectureProcesses(List<HomeWorkLectureProcess> homeWorkLectureProcesses) {
		this.homeWorkLectureProcesses = homeWorkLectureProcesses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}