package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the InterActiveLectureChapter database table.
 * 
 */
@Embeddable
public class InterActiveLectureChapterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idChapter;

	@Column(insertable=false, updatable=false)
	private long idInterActiveLecture;

	public InterActiveLectureChapterPK() {
	}
	public long getIdChapter() {
		return this.idChapter;
	}
	public void setIdChapter(long idChapter) {
		this.idChapter = idChapter;
	}
	public long getIdInterActiveLecture() {
		return this.idInterActiveLecture;
	}
	public void setIdInterActiveLecture(long idInterActiveLecture) {
		this.idInterActiveLecture = idInterActiveLecture;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InterActiveLectureChapterPK)) {
			return false;
		}
		InterActiveLectureChapterPK castOther = (InterActiveLectureChapterPK)other;
		return 
			(this.idChapter == castOther.idChapter)
			&& (this.idInterActiveLecture == castOther.idInterActiveLecture);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idChapter ^ (this.idChapter >>> 32)));
		hash = hash * prime + ((int) (this.idInterActiveLecture ^ (this.idInterActiveLecture >>> 32)));
		
		return hash;
	}
}