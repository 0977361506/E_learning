package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CourseRequirement database table.
 * 
 */
@Entity
@Table(name = "CourseRequirement")

public class CourseRequirement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Course
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourse")
	private Course course;

	//bi-directional many-to-one association to PositionName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPositionname")
	private PositionName positionName;

	public CourseRequirement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public PositionName getPositionName() {
		return this.positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

}