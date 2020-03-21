package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FreedomLecture database table.
 * 
 */
@Entity
@Table(name = "FreedomLecture")

public class FreedomLecture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String contents;

	private String createdBy;

	private Date createdDate;

	private String description;

	private long idCourseWare;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	private int shared;

	private int stored;

	//bi-directional many-to-one association to ChapterFreedomLecture
	@OneToMany(mappedBy="freedomLecture")
	private List<ChapterFreedomLecture> chapterFreedomLectures;

	//bi-directional many-to-one association to FreedomLectureProcess
	@OneToMany(mappedBy="freedomLecture")
	private List<FreedomLectureProcess> freedomLectureProcesses;

	public FreedomLecture() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getIdCourseWare() {
		return idCourseWare;
	}

	public void setIdCourseWare(long idCourseWare) {
		this.idCourseWare = idCourseWare;
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

	public int getStored() {
		return stored;
	}

	public void setStored(int stored) {
		this.stored = stored;
	}

	public List<ChapterFreedomLecture> getChapterFreedomLectures() {
		return chapterFreedomLectures;
	}

	public void setChapterFreedomLectures(List<ChapterFreedomLecture> chapterFreedomLectures) {
		this.chapterFreedomLectures = chapterFreedomLectures;
	}

	public List<FreedomLectureProcess> getFreedomLectureProcesses() {
		return freedomLectureProcesses;
	}

	public void setFreedomLectureProcesses(List<FreedomLectureProcess> freedomLectureProcesses) {
		this.freedomLectureProcesses = freedomLectureProcesses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}