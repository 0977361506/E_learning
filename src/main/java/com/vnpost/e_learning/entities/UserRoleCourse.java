package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


import java.util.Date;


/**
 * The persistent class for the UserRoleCourse database table.
 * 
 */
@Entity
@Table(name = "UserRoleCourse")

public class UserRoleCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private int status;

	private Date timeCreate;

	//bi-directional many-to-one association to Course
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourse")
	private Course course;

	//bi-directional many-to-one association to CourseRole
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseRole")
	private CourseRole courseRole;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public UserRoleCourse() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseRole getCourseRole() {
		return this.courseRole;
	}

	public void setCourseRole(CourseRole courseRole) {
		this.courseRole = courseRole;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}