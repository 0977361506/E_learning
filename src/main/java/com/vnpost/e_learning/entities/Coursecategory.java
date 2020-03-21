package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Coursecategory database table.
 * 
 */
@Entity
@Table(name = "Coursecategory")

public class Coursecategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	//bi-directional many-to-one association to Course
	@OneToMany(mappedBy="coursecategory")
	private List<Course> courses;

	//bi-directional many-to-many association to Coursecategory
	@ManyToMany
	@JoinTable(
		name="CourseCategoryTree"
		, joinColumns={
			@JoinColumn(name="idCourseCategory2")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idCourseCategory")
			}
		)
	private List<Coursecategory> coursecategories1;

	//bi-directional many-to-many association to Coursecategory
	@ManyToMany(mappedBy="coursecategories1")
	private List<Coursecategory> coursecategories2;

	public Coursecategory() {
	}

	public long getId() {
		return id;
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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Coursecategory> getCoursecategories1() {
		return coursecategories1;
	}

	public void setCoursecategories1(List<Coursecategory> coursecategories1) {
		this.coursecategories1 = coursecategories1;
	}

	public List<Coursecategory> getCoursecategories2() {
		return coursecategories2;
	}

	public void setCoursecategories2(List<Coursecategory> coursecategories2) {
		this.coursecategories2 = coursecategories2;
	}

	
}