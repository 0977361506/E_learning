package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Rate database table.
 * 
 */
@Entity
@Table(name = "Rate")

public class Rate implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int valuess;

	//bi-directional many-to-one association to Course
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCourse")
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public Rate() {
	}

	public int getValuess() {
		return this.valuess;
	}

	public void setValuess(int valuess) {
		this.valuess = valuess;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}