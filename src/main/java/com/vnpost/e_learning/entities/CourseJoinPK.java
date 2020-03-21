package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CourseJoin database table.
 * 
 */
@Embeddable
public class CourseJoinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idUser;

	private long idCourse;

	public CourseJoinPK() {
	}
	public long getIdUser() {
		return this.idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public long getIdCourse() {
		return this.idCourse;
	}
	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CourseJoinPK)) {
			return false;
		}
		CourseJoinPK castOther = (CourseJoinPK)other;
		return 
			(this.idUser == castOther.idUser)
			&& (this.idCourse == castOther.idCourse);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idUser ^ (this.idUser >>> 32)));
		hash = hash * prime + ((int) (this.idCourse ^ (this.idCourse >>> 32)));
		
		return hash;
	}
}