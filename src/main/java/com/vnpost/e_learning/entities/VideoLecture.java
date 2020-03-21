package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the VideoLecture database table.
 * 
 */
@Entity
@Table(name = "VideoLecture")

public class VideoLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String createdBy;

	private Date createdDate;

	private String description;

	private String files;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	private int shared;

	private int stored;

	private int totalDuration;

	//bi-directional many-to-one association to ChapterVideoLecture
	@OneToMany(mappedBy="videoLecture")
	private List<ChapterVideoLecture> chapterVideoLectures;

	//bi-directional many-to-one association to CourseWare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseWare")
	private CourseWare courseWare;

	//bi-directional many-to-one association to VideoLectureProcess
	@OneToMany(mappedBy="videoLecture")
	private List<VideoLectureProcess> videoLectureProcesses;

	public VideoLecture() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFiles() {
		return this.files;
	}

	public void setFiles(String files) {
		this.files = files;
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

	public int getTotalDuration() {
		return this.totalDuration;
	}

	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}

	public List<ChapterVideoLecture> getChapterVideoLectures() {
		return this.chapterVideoLectures;
	}

	public void setChapterVideoLectures(List<ChapterVideoLecture> chapterVideoLectures) {
		this.chapterVideoLectures = chapterVideoLectures;
	}

	public ChapterVideoLecture addChapterVideoLecture(ChapterVideoLecture chapterVideoLecture) {
		getChapterVideoLectures().add(chapterVideoLecture);
		chapterVideoLecture.setVideoLecture(this);

		return chapterVideoLecture;
	}

	public ChapterVideoLecture removeChapterVideoLecture(ChapterVideoLecture chapterVideoLecture) {
		getChapterVideoLectures().remove(chapterVideoLecture);
		chapterVideoLecture.setVideoLecture(null);

		return chapterVideoLecture;
	}

	public CourseWare getCourseWare() {
		return this.courseWare;
	}

	public void setCourseWare(CourseWare courseWare) {
		this.courseWare = courseWare;
	}

	public List<VideoLectureProcess> getVideoLectureProcesses() {
		return this.videoLectureProcesses;
	}

	public void setVideoLectureProcesses(List<VideoLectureProcess> videoLectureProcesses) {
		this.videoLectureProcesses = videoLectureProcesses;
	}

	public VideoLectureProcess addVideoLectureProcess(VideoLectureProcess videoLectureProcess) {
		getVideoLectureProcesses().add(videoLectureProcess);
		videoLectureProcess.setVideoLecture(this);

		return videoLectureProcess;
	}

	public VideoLectureProcess removeVideoLectureProcess(VideoLectureProcess videoLectureProcess) {
		getVideoLectureProcesses().remove(videoLectureProcess);
		videoLectureProcess.setVideoLecture(null);

		return videoLectureProcess;
	}

}