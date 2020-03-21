package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CourseDocument database table.
 * 
 */
@Embeddable
public class CourseDocumentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long idCourse;

	@Column(insertable=false, updatable=false)
	private long idDocument;

	public CourseDocumentPK() {
	}
	public long getIdCourse() {
		return this.idCourse;
	}
	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}
	public long getIdDocument() {
		return this.idDocument;
	}
	public void setIdDocument(long idDocument) {
		this.idDocument = idDocument;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CourseDocumentPK)) {
			return false;
		}
		CourseDocumentPK castOther = (CourseDocumentPK)other;
		return 
			(this.idCourse == castOther.idCourse)
			&& (this.idDocument == castOther.idDocument);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idCourse ^ (this.idCourse >>> 32)));
		hash = hash * prime + ((int) (this.idDocument ^ (this.idDocument >>> 32)));
		
		return hash;
	}
}