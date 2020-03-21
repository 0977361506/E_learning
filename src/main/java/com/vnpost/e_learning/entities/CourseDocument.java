package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CourseDocument database table.
 * 
 */
@Entity
@Table(name = "CourseDocument")

public class CourseDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CourseDocumentPK id;

	//bi-directional many-to-one association to Document
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDocument",insertable = false, updatable = false)
	private Document document;

	public CourseDocument() {
	}

	public CourseDocumentPK getId() {
		return this.id;
	}

	public void setId(CourseDocumentPK id) {
		this.id = id;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}