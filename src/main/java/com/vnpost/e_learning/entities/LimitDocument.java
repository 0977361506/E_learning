package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the LimitDocument database table.
 * 
 */
@Entity
@Table(name = "LimitDocument")

public class LimitDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String nameLimit;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="limitDocument")
	private List<Document> documents;

	public LimitDocument() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameLimit() {
		return this.nameLimit;
	}

	public void setNameLimit(String nameLimit) {
		this.nameLimit = nameLimit;
	}

	public List<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Document addDocument(Document document) {
		getDocuments().add(document);
		document.setLimitDocument(this);

		return document;
	}

	public Document removeDocument(Document document) {
		getDocuments().remove(document);
		document.setLimitDocument(null);

		return document;
	}

}