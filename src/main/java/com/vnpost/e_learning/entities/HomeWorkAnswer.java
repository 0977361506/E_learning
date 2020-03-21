package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the HomeWorkAnswer database table.
 * 
 */
@Entity
@Table(name = "HomeWorkAnswer")

public class HomeWorkAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String contents;

	private String createdBy;

	private Date createdDate;

	private String files;

	private String modifiedBy;

	private Date modifiedDate;

	//bi-directional many-to-one association to HomeWorkLectureProcess
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idHomeWorkLectureProcess")
	private HomeWorkLectureProcess homeWorkLectureProcess;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public HomeWorkAnswer() {
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

	public HomeWorkLectureProcess getHomeWorkLectureProcess() {
		return homeWorkLectureProcess;
	}

	public void setHomeWorkLectureProcess(HomeWorkLectureProcess homeWorkLectureProcess) {
		this.homeWorkLectureProcess = homeWorkLectureProcess;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}