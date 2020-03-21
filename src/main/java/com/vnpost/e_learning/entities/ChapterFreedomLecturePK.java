package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ChapterFreedomLecture database table.
 * 
 */
@Embeddable
public class ChapterFreedomLecturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idChapter;

	@Column(insertable=false, updatable=false)
	private long idFreedomLecture;

	public ChapterFreedomLecturePK() {
	}
	public long getIdChapter() {
		return this.idChapter;
	}
	public void setIdChapter(long idChapter) {
		this.idChapter = idChapter;
	}
	public long getIdFreedomLecture() {
		return this.idFreedomLecture;
	}
	public void setIdFreedomLecture(long idFreedomLecture) {
		this.idFreedomLecture = idFreedomLecture;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChapterFreedomLecturePK)) {
			return false;
		}
		ChapterFreedomLecturePK castOther = (ChapterFreedomLecturePK)other;
		return 
			(this.idChapter == castOther.idChapter)
			&& (this.idFreedomLecture == castOther.idFreedomLecture);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idChapter ^ (this.idChapter >>> 32)));
		hash = hash * prime + ((int) (this.idFreedomLecture ^ (this.idFreedomLecture >>> 32)));
		
		return hash;
	}
}