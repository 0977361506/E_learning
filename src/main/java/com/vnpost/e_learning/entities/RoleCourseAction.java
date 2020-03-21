package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the RoleCourseAction database table.
 * 
 */
@Entity
@Table(name = "RoleCourseAction")

public class RoleCourseAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private long idActionCourse;

	private Date lastUpdate;

	private String nameAction;

	private int statusAction;

	private Date timeCreate;

	//bi-directional many-to-one association to CourseRole
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseRole")
	private CourseRole courseRole;

	public RoleCourseAction() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdActionCourse() {
		return this.idActionCourse;
	}

	public void setIdActionCourse(long idActionCourse) {
		this.idActionCourse = idActionCourse;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameAction() {
		return nameAction;
	}

	public void setNameAction(String nameAction) {
		this.nameAction = nameAction;
	}

	public int getStatusAction() {
		return statusAction;
	}

	public void setStatusAction(int statusAction) {
		this.statusAction = statusAction;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public CourseRole getCourseRole() {
		return courseRole;
	}

	public void setCourseRole(CourseRole courseRole) {
		this.courseRole = courseRole;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}