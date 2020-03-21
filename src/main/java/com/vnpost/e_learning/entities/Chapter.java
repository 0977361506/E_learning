package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Chapter database table.
 * 
 */
@Entity
@Table(name = "Chapter")

public class Chapter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String createdBy;

	private Date createdDate;

	private long idOutline;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	//bi-directional many-to-one association to ChapterFreedomLecture
	@OneToMany(mappedBy="chapter")
	private List<ChapterFreedomLecture> chapterFreedomLectures;

	//bi-directional many-to-one association to ChapterHomeWork
	@OneToMany(mappedBy="chapter")
	private List<ChapterHomeWork> chapterHomeWorks;

	//bi-directional many-to-one association to ChapterPowerpointlecture
	@OneToMany(mappedBy="chapter")
	private List<ChapterPowerpointlecture> chapterPowerpointlectures;

	//bi-directional many-to-one association to ChapterScormLecture
	@OneToMany(mappedBy="chapter")
	private List<ChapterScormLecture> chapterScormLectures;

	//bi-directional many-to-one association to ChapterVideoLecture
	@OneToMany(mappedBy="chapter")
	private List<ChapterVideoLecture> chapterVideoLectures;

	//bi-directional many-to-one association to CourseWare
	@OneToMany(mappedBy="chapter")
	private List<CourseWare> courseWares;

	//bi-directional many-to-one association to FreedomLectureProcess
	@OneToMany(mappedBy="chapter1")
	private List<FreedomLectureProcess> freedomLectureProcesses1;

	//bi-directional many-to-one association to FreedomLectureProcess
	@OneToMany(mappedBy="chapter2")
	private List<FreedomLectureProcess> freedomLectureProcesses2;

	//bi-directional many-to-one association to HomeWorkLectureProcess
	@OneToMany(mappedBy="chapter")
	private List<HomeWorkLectureProcess> homeWorkLectureProcesses;

	//bi-directional many-to-one association to InterActiveLectureChapter
	@OneToMany(mappedBy="chapter")
	private List<InterActiveLectureChapter> interActiveLectureChapters;

	//bi-directional many-to-one association to InterActiveLectureprocess
	@OneToMany(mappedBy="chapter")
	private List<InterActiveLectureprocess> interActiveLectureprocesses;

	//bi-directional many-to-one association to PowerpointLectureProcess
	@OneToMany(mappedBy="chapter")
	private List<PowerpointLectureProcess> powerpointLectureProcesses;

	//bi-directional many-to-one association to ScormLectureProcess
	@OneToMany(mappedBy="chapter")
	private List<ScormLectureProcess> scormLectureProcesses;

	//bi-directional many-to-one association to VideoLectureProcess
	@OneToMany(mappedBy="chapter")
	private List<VideoLectureProcess> videoLectureProcesses;

	public Chapter() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
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

	public long getIdOutline() {
		return idOutline;
	}

	public void setIdOutline(long idOutline) {
		this.idOutline = idOutline;
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

	public List<ChapterFreedomLecture> getChapterFreedomLectures() {
		return chapterFreedomLectures;
	}

	public void setChapterFreedomLectures(List<ChapterFreedomLecture> chapterFreedomLectures) {
		this.chapterFreedomLectures = chapterFreedomLectures;
	}

	public List<ChapterHomeWork> getChapterHomeWorks() {
		return chapterHomeWorks;
	}

	public void setChapterHomeWorks(List<ChapterHomeWork> chapterHomeWorks) {
		this.chapterHomeWorks = chapterHomeWorks;
	}

	public List<ChapterPowerpointlecture> getChapterPowerpointlectures() {
		return chapterPowerpointlectures;
	}

	public void setChapterPowerpointlectures(List<ChapterPowerpointlecture> chapterPowerpointlectures) {
		this.chapterPowerpointlectures = chapterPowerpointlectures;
	}

	public List<ChapterScormLecture> getChapterScormLectures() {
		return chapterScormLectures;
	}

	public void setChapterScormLectures(List<ChapterScormLecture> chapterScormLectures) {
		this.chapterScormLectures = chapterScormLectures;
	}

	public List<ChapterVideoLecture> getChapterVideoLectures() {
		return chapterVideoLectures;
	}

	public void setChapterVideoLectures(List<ChapterVideoLecture> chapterVideoLectures) {
		this.chapterVideoLectures = chapterVideoLectures;
	}

	public List<CourseWare> getCourseWares() {
		return courseWares;
	}

	public void setCourseWares(List<CourseWare> courseWares) {
		this.courseWares = courseWares;
	}

	public List<FreedomLectureProcess> getFreedomLectureProcesses1() {
		return freedomLectureProcesses1;
	}

	public void setFreedomLectureProcesses1(List<FreedomLectureProcess> freedomLectureProcesses1) {
		this.freedomLectureProcesses1 = freedomLectureProcesses1;
	}

	public List<FreedomLectureProcess> getFreedomLectureProcesses2() {
		return freedomLectureProcesses2;
	}

	public void setFreedomLectureProcesses2(List<FreedomLectureProcess> freedomLectureProcesses2) {
		this.freedomLectureProcesses2 = freedomLectureProcesses2;
	}

	public List<HomeWorkLectureProcess> getHomeWorkLectureProcesses() {
		return homeWorkLectureProcesses;
	}

	public void setHomeWorkLectureProcesses(List<HomeWorkLectureProcess> homeWorkLectureProcesses) {
		this.homeWorkLectureProcesses = homeWorkLectureProcesses;
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

	public List<PowerpointLectureProcess> getPowerpointLectureProcesses() {
		return powerpointLectureProcesses;
	}

	public void setPowerpointLectureProcesses(List<PowerpointLectureProcess> powerpointLectureProcesses) {
		this.powerpointLectureProcesses = powerpointLectureProcesses;
	}

	public List<ScormLectureProcess> getScormLectureProcesses() {
		return scormLectureProcesses;
	}

	public void setScormLectureProcesses(List<ScormLectureProcess> scormLectureProcesses) {
		this.scormLectureProcesses = scormLectureProcesses;
	}

	public List<VideoLectureProcess> getVideoLectureProcesses() {
		return videoLectureProcesses;
	}

	public void setVideoLectureProcesses(List<VideoLectureProcess> videoLectureProcesses) {
		this.videoLectureProcesses = videoLectureProcesses;
	}



	
}