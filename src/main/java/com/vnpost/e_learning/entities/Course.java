package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Course database table.
 * 
 */
@Entity
@Table(name = "Course")

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String avatar;

	private String createdBy;

	private Date createdDate;

	private String description;

	private int highlight;

	private String modifiedBy;

	private Date modifiedDate;

	private String name;

	private int price;

	private int showName;

	private int status;

	private int stepbystep;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="course")
	private List<Comment> comments;

	//bi-directional many-to-one association to Coursecategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourseCategory")
	private Coursecategory coursecategory;

	//bi-directional many-to-one association to CourseConfig
	@OneToMany(mappedBy="course")
	private List<CourseConfig> courseConfigs;

	//bi-directional many-to-many association to Course
	@ManyToMany
	@JoinTable(
		name="CourseCourse"
		, joinColumns={
			@JoinColumn(name="idCourse2")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idCourse")
			}
		)
	private List<Course> courses1;

	//bi-directional many-to-many association to Course
	@ManyToMany(mappedBy="courses1")
	private List<Course> courses2;

	//bi-directional many-to-one association to CourseRequirement
	@OneToMany(mappedBy="course")
	private List<CourseRequirement> courseRequirements;

	//bi-directional many-to-one association to Group
	@OneToMany(mappedBy="course")
	private List<Group> groups;

	//bi-directional many-to-one association to Outline
	@OneToMany(mappedBy="course")
	private List<Outline> outlines;

	//bi-directional many-to-one association to Rate
	@OneToMany(mappedBy="course")
	private List<Rate> rates;

	//bi-directional many-to-one association to UserRoleCourse
	@OneToMany(mappedBy="course")
	private List<UserRoleCourse> userRoleCourses;

	public Course() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
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

	public int getHighlight() {
		return highlight;
	}

	public void setHighlight(int highlight) {
		this.highlight = highlight;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getShowName() {
		return showName;
	}

	public void setShowName(int showName) {
		this.showName = showName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStepbystep() {
		return stepbystep;
	}

	public void setStepbystep(int stepbystep) {
		this.stepbystep = stepbystep;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Coursecategory getCoursecategory() {
		return coursecategory;
	}

	public void setCoursecategory(Coursecategory coursecategory) {
		this.coursecategory = coursecategory;
	}

	public List<CourseConfig> getCourseConfigs() {
		return courseConfigs;
	}

	public void setCourseConfigs(List<CourseConfig> courseConfigs) {
		this.courseConfigs = courseConfigs;
	}

	public List<Course> getCourses1() {
		return courses1;
	}

	public void setCourses1(List<Course> courses1) {
		this.courses1 = courses1;
	}

	public List<Course> getCourses2() {
		return courses2;
	}

	public void setCourses2(List<Course> courses2) {
		this.courses2 = courses2;
	}

	public List<CourseRequirement> getCourseRequirements() {
		return courseRequirements;
	}

	public void setCourseRequirements(List<CourseRequirement> courseRequirements) {
		this.courseRequirements = courseRequirements;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Outline> getOutlines() {
		return outlines;
	}

	public void setOutlines(List<Outline> outlines) {
		this.outlines = outlines;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public List<UserRoleCourse> getUserRoleCourses() {
		return userRoleCourses;
	}

	public void setUserRoleCourses(List<UserRoleCourse> userRoleCourses) {
		this.userRoleCourses = userRoleCourses;
	}

	
}