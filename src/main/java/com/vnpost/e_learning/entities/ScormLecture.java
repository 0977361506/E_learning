package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ScormLecture database table.
 * 
 */
@Entity
@Table(name = "ScormLecture")

public class ScormLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String createdBy;

	private Date createdDate;

	private String files;

	private int isFlash;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	private int shared;

	private int stored;

	private int totalTime;

	//bi-directional many-to-one association to ChapterScormLecture
	@OneToMany(mappedBy="scormLecture")
	private List<ChapterScormLecture> chapterScormLectures;

	//bi-directional many-to-one association to CourseWare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseWare")
	private CourseWare courseWare;

	//bi-directional many-to-one association to ScormLectureProcess
	@OneToMany(mappedBy="scormLecture")
	private List<ScormLectureProcess> scormLectureProcesses;

	public ScormLecture() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getFiles() {
		return this.files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public int getIsFlash() {
		return this.isFlash;
	}

	public void setIsFlash(int isFlash) {
		this.isFlash = isFlash;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShared() {
		return this.shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public int getStored() {
		return this.stored;
	}

	public void setStored(int stored) {
		this.stored = stored;
	}

	public int getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public List<ChapterScormLecture> getChapterScormLectures() {
		return this.chapterScormLectures;
	}

	public void setChapterScormLectures(List<ChapterScormLecture> chapterScormLectures) {
		this.chapterScormLectures = chapterScormLectures;
	}

	public ChapterScormLecture addChapterScormLecture(ChapterScormLecture chapterScormLecture) {
		getChapterScormLectures().add(chapterScormLecture);
		chapterScormLecture.setScormLecture(this);

		return chapterScormLecture;
	}

	public ChapterScormLecture removeChapterScormLecture(ChapterScormLecture chapterScormLecture) {
		getChapterScormLectures().remove(chapterScormLecture);
		chapterScormLecture.setScormLecture(null);

		return chapterScormLecture;
	}

	public CourseWare getCourseWare() {
		return this.courseWare;
	}

	public void setCourseWare(CourseWare courseWare) {
		this.courseWare = courseWare;
	}

	public List<ScormLectureProcess> getScormLectureProcesses() {
		return this.scormLectureProcesses;
	}

	public void setScormLectureProcesses(List<ScormLectureProcess> scormLectureProcesses) {
		this.scormLectureProcesses = scormLectureProcesses;
	}

	public ScormLectureProcess addScormLectureProcess(ScormLectureProcess scormLectureProcess) {
		getScormLectureProcesses().add(scormLectureProcess);
		scormLectureProcess.setScormLecture(this);

		return scormLectureProcess;
	}

	public ScormLectureProcess removeScormLectureProcess(ScormLectureProcess scormLectureProcess) {
		getScormLectureProcesses().remove(scormLectureProcess);
		scormLectureProcess.setScormLecture(null);

		return scormLectureProcess;
	}

}