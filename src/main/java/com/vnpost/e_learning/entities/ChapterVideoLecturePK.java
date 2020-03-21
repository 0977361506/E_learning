package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ChapterVideoLecture database table.
 * 
 */
@Embeddable
public class ChapterVideoLecturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idChapter;

	@Column(insertable=false, updatable=false)
	private long idVideoLecture;

	public ChapterVideoLecturePK() {
	}
	public long getIdChapter() {
		return this.idChapter;
	}
	public void setIdChapter(long idChapter) {
		this.idChapter = idChapter;
	}
	public long getIdVideoLecture() {
		return this.idVideoLecture;
	}
	public void setIdVideoLecture(long idVideoLecture) {
		this.idVideoLecture = idVideoLecture;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChapterVideoLecturePK)) {
			return false;
		}
		ChapterVideoLecturePK castOther = (ChapterVideoLecturePK)other;
		return 
			(this.idChapter == castOther.idChapter)
			&& (this.idVideoLecture == castOther.idVideoLecture);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idChapter ^ (this.idChapter >>> 32)));
		hash = hash * prime + ((int) (this.idVideoLecture ^ (this.idVideoLecture >>> 32)));
		
		return hash;
	}
}