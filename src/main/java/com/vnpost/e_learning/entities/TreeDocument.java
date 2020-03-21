package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreeDocument database table.
 * 
 */
@Entity
@Table(name = "TreeDocument")

public class TreeDocument implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to DocumentCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDocumentCategoryOne")
	private DocumentCategory documentCategory1;

	//bi-directional many-to-one association to DocumentCategory
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDocumentCategoryTwo")
	private DocumentCategory documentCategory2;

	public TreeDocument() {
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public DocumentCategory getDocumentCategory1() {
		return this.documentCategory1;
	}

	public void setDocumentCategory1(DocumentCategory documentCategory1) {
		this.documentCategory1 = documentCategory1;
	}

	public DocumentCategory getDocumentCategory2() {
		return this.documentCategory2;
	}

	public void setDocumentCategory2(DocumentCategory documentCategory2) {
		this.documentCategory2 = documentCategory2;
	}

}