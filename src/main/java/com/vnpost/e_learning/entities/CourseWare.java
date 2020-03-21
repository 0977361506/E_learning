package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the CourseWare database table.
 * 
 */
@Entity
@Table(name = "CourseWare")

public class CourseWare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	//bi-directional many-to-one association to Chapter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idChapter")
	private Chapter chapter;

	//bi-directional many-to-one association to HomeWork
	@OneToMany(mappedBy="courseWare")
	private List<HomeWork> homeWorks;

	//bi-directional many-to-one association to InterActiveLecture
	@OneToMany(mappedBy="courseWare")
	private List<InterActiveLecture> interActiveLectures;

	//bi-directional many-to-one association to PowerpointLecture
	@OneToMany(mappedBy="courseWare")
	private List<PowerpointLecture> powerpointLectures;

	//bi-directional many-to-one association to ScormLecture
	@OneToMany(mappedBy="courseWare")
	private List<ScormLecture> scormLectures;

	//bi-directional many-to-one association to VideoLecture
	@OneToMany(mappedBy="courseWare")
	private List<VideoLecture> videoLectures;

	public CourseWare() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public List<HomeWork> getHomeWorks() {
		return homeWorks;
	}

	public void setHomeWorks(List<HomeWork> homeWorks) {
		this.homeWorks = homeWorks;
	}

	public List<InterActiveLecture> getInterActiveLectures() {
		return interActiveLectures;
	}

	public void setInterActiveLectures(List<InterActiveLecture> interActiveLectures) {
		this.interActiveLectures = interActiveLectures;
	}

	public List<PowerpointLecture> getPowerpointLectures() {
		return powerpointLectures;
	}

	public void setPowerpointLectures(List<PowerpointLecture> powerpointLectures) {
		this.powerpointLectures = powerpointLectures;
	}

	public List<ScormLecture> getScormLectures() {
		return scormLectures;
	}

	public void setScormLectures(List<ScormLecture> scormLectures) {
		this.scormLectures = scormLectures;
	}

	public List<VideoLecture> getVideoLectures() {
		return videoLectures;
	}

	public void setVideoLectures(List<VideoLecture> videoLectures) {
		this.videoLectures = videoLectures;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}