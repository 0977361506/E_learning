package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PowerpointLecture database table.
 * 
 */
@Entity
@Table(name = "PowerpointLecture")

public class PowerpointLecture implements Serializable {
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

	@Column(name="Totallearn")
	private int totallearn;

	//bi-directional many-to-one association to ChapterPowerpointlecture
	@OneToMany(mappedBy="powerpointLecture")
	private List<ChapterPowerpointlecture> chapterPowerpointlectures;

	//bi-directional many-to-one association to CourseWare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseWare")
	private CourseWare courseWare;

	//bi-directional many-to-one association to PowerpointLectureProcess
	@OneToMany(mappedBy="powerpointLecture")
	private List<PowerpointLectureProcess> powerpointLectureProcesses;

	public PowerpointLecture() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getStored() {
		return stored;
	}

	public void setStored(int stored) {
		this.stored = stored;
	}

	public int getTotallearn() {
		return totallearn;
	}

	public void setTotallearn(int totallearn) {
		this.totallearn = totallearn;
	}

	public List<ChapterPowerpointlecture> getChapterPowerpointlectures() {
		return chapterPowerpointlectures;
	}

	public void setChapterPowerpointlectures(List<ChapterPowerpointlecture> chapterPowerpointlectures) {
		this.chapterPowerpointlectures = chapterPowerpointlectures;
	}

	public CourseWare getCourseWare() {
		return courseWare;
	}

	public void setCourseWare(CourseWare courseWare) {
		this.courseWare = courseWare;
	}

	public List<PowerpointLectureProcess> getPowerpointLectureProcesses() {
		return powerpointLectureProcesses;
	}

	public void setPowerpointLectureProcesses(List<PowerpointLectureProcess> powerpointLectureProcesses) {
		this.powerpointLectureProcesses = powerpointLectureProcesses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}