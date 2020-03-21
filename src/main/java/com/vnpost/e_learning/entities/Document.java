package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Document database table.
 * 
 */
@Entity
@Table(name = "Document")

public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String describes;

	private String idUnit;

	private Date lastUpdate;

	private String linkFile;

	private String nameDocument;

	private int shares;

	private int statusDocument;

	private Date timeCreate;

	//bi-directional many-to-one association to CourseDocument
	@OneToMany(mappedBy="document")
	private List<CourseDocument> courseDocuments;

	//bi-directional many-to-one association to DocumentCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDocumentCategory")
	private DocumentCategory documentCategory;

	//bi-directional many-to-one association to LimitDocument
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idLimit")
	private LimitDocument limitDocument;

	//bi-directional many-to-one association to Prioritize
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPrioritize")
	private Prioritize prioritize;

	public Document() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescribes() {
		return this.describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public String getIdUnit() {
		return this.idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getLinkFile() {
		return linkFile;
	}

	public void setLinkFile(String linkFile) {
		this.linkFile = linkFile;
	}

	public String getNameDocument() {
		return nameDocument;
	}

	public void setNameDocument(String nameDocument) {
		this.nameDocument = nameDocument;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public int getStatusDocument() {
		return statusDocument;
	}

	public void setStatusDocument(int statusDocument) {
		this.statusDocument = statusDocument;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<CourseDocument> getCourseDocuments() {
		return courseDocuments;
	}

	public void setCourseDocuments(List<CourseDocument> courseDocuments) {
		this.courseDocuments = courseDocuments;
	}

	public DocumentCategory getDocumentCategory() {
		return documentCategory;
	}

	public void setDocumentCategory(DocumentCategory documentCategory) {
		this.documentCategory = documentCategory;
	}

	public LimitDocument getLimitDocument() {
		return limitDocument;
	}

	public void setLimitDocument(LimitDocument limitDocument) {
		this.limitDocument = limitDocument;
	}

	public Prioritize getPrioritize() {
		return prioritize;
	}

	public void setPrioritize(Prioritize prioritize) {
		this.prioritize = prioritize;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}