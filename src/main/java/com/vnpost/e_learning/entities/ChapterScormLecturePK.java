package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ChapterScormLecture database table.
 * 
 */
@Embeddable
public class ChapterScormLecturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idChapter;

	@Column(insertable=false, updatable=false)
	private long idScormLecture;

	public ChapterScormLecturePK() {
	}
	public long getIdChapter() {
		return this.idChapter;
	}
	public void setIdChapter(long idChapter) {
		this.idChapter = idChapter;
	}
	public long getIdScormLecture() {
		return this.idScormLecture;
	}
	public void setIdScormLecture(long idScormLecture) {
		this.idScormLecture = idScormLecture;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChapterScormLecturePK)) {
			return false;
		}
		ChapterScormLecturePK castOther = (ChapterScormLecturePK)other;
		return 
			(this.idChapter == castOther.idChapter)
			&& (this.idScormLecture == castOther.idScormLecture);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idChapter ^ (this.idChapter >>> 32)));
		hash = hash * prime + ((int) (this.idScormLecture ^ (this.idScormLecture >>> 32)));
		
		return hash;
	}
}