package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ChapterHomeWork database table.
 * 
 */
@Embeddable
public class ChapterHomeWorkPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long idChapter;

	@Column(insertable=false, updatable=false)
	private long idHomeWork;

	public ChapterHomeWorkPK() {
	}
	public long getIdChapter() {
		return this.idChapter;
	}
	public void setIdChapter(long idChapter) {
		this.idChapter = idChapter;
	}
	public long getIdHomeWork() {
		return this.idHomeWork;
	}
	public void setIdHomeWork(long idHomeWork) {
		this.idHomeWork = idHomeWork;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChapterHomeWorkPK)) {
			return false;
		}
		ChapterHomeWorkPK castOther = (ChapterHomeWorkPK)other;
		return 
			(this.idChapter == castOther.idChapter)
			&& (this.idHomeWork == castOther.idHomeWork);
	}


}