package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the CourseConfig database table.
 * 
 */
@Entity
@Table(name = "CourseConfig")

public class CourseConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int approveAuto;

	private Date endLearning;

	private Date ends;

	private int freedomRegister;

	private Date registerEnd;

	private Date registerStart;

	private Date startLearning;

	private Date starts;

	//bi-directional many-to-one association to Course
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourse")
	private Course course;

	public CourseConfig() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getApproveAuto() {
		return approveAuto;
	}

	public void setApproveAuto(int approveAuto) {
		this.approveAuto = approveAuto;
	}

	public Date getEndLearning() {
		return endLearning;
	}

	public void setEndLearning(Date endLearning) {
		this.endLearning = endLearning;
	}

	public Date getEnds() {
		return ends;
	}

	public void setEnds(Date ends) {
		this.ends = ends;
	}

	public int getFreedomRegister() {
		return freedomRegister;
	}

	public void setFreedomRegister(int freedomRegister) {
		this.freedomRegister = freedomRegister;
	}

	public Date getRegisterEnd() {
		return registerEnd;
	}

	public void setRegisterEnd(Date registerEnd) {
		this.registerEnd = registerEnd;
	}

	public Date getRegisterStart() {
		return registerStart;
	}

	public void setRegisterStart(Date registerStart) {
		this.registerStart = registerStart;
	}

	public Date getStartLearning() {
		return startLearning;
	}

	public void setStartLearning(Date startLearning) {
		this.startLearning = startLearning;
	}

	public Date getStarts() {
		return starts;
	}

	public void setStarts(Date starts) {
		this.starts = starts;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
}