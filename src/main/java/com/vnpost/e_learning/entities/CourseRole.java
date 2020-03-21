package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CourseRole database table.
 * 
 */
@Entity
@Table(name = "CourseRole")

public class CourseRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private Date lastUpdate;

	private String nameCourse;

	private Date timeCreate;

	//bi-directional many-to-one association to RoleCourseAction
	@OneToMany(mappedBy="courseRole")
	private List<RoleCourseAction> roleCourseActions;

	//bi-directional many-to-one association to UserRoleCourse
	@OneToMany(mappedBy="courseRole")
	private List<UserRoleCourse> userRoleCourses;

	public CourseRole() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<RoleCourseAction> getRoleCourseActions() {
		return roleCourseActions;
	}

	public void setRoleCourseActions(List<RoleCourseAction> roleCourseActions) {
		this.roleCourseActions = roleCourseActions;
	}

	public List<UserRoleCourse> getUserRoleCourses() {
		return userRoleCourses;
	}

	public void setUserRoleCourses(List<UserRoleCourse> userRoleCourses) {
		this.userRoleCourses = userRoleCourses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}