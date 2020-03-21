package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ChapterPowerpointlecture database table.
 * 
 */
@Embeddable
public class ChapterPowerpointlecturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idChapter;

	@Column(insertable=false, updatable=false)
	private long idPowerpointLecture;

	public ChapterPowerpointlecturePK() {
	}
	public long getIdChapter() {
		return this.idChapter;
	}
	public void setIdChapter(long idChapter) {
		this.idChapter = idChapter;
	}
	public long getIdPowerpointLecture() {
		return this.idPowerpointLecture;
	}
	public void setIdPowerpointLecture(long idPowerpointLecture) {
		this.idPowerpointLecture = idPowerpointLecture;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChapterPowerpointlecturePK)) {
			return false;
		}
		ChapterPowerpointlecturePK castOther = (ChapterPowerpointlecturePK)other;
		return 
			(this.idChapter == castOther.idChapter)
			&& (this.idPowerpointLecture == castOther.idPowerpointLecture);
	}

}