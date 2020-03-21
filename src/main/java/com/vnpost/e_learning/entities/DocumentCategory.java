package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DocumentCategory database table.
 * 
 */
@Entity
@Table(name = "DocumentCategory")

public class DocumentCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int describes;

	private Date lastUpdate;

	private String nameDocument;

	private Date timeCreate;

	//bi-directional many-to-one association to Document
	@OneToMany(mappedBy="documentCategory")
	private List<Document> documents;

	//bi-directional many-to-one association to TreeDocument
	@OneToMany(mappedBy="documentCategory1")
	private List<TreeDocument> treeDocuments1;

	//bi-directional many-to-one association to TreeDocument
	@OneToMany(mappedBy="documentCategory2")
	private List<TreeDocument> treeDocuments2;

	public DocumentCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDescribes() {
		return this.describes;
	}

	public void setDescribes(int describes) {
		this.describes = describes;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameDocument() {
		return nameDocument;
	}

	public void setNameDocument(String nameDocument) {
		this.nameDocument = nameDocument;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<TreeDocument> getTreeDocuments1() {
		return treeDocuments1;
	}

	public void setTreeDocuments1(List<TreeDocument> treeDocuments1) {
		this.treeDocuments1 = treeDocuments1;
	}

	public List<TreeDocument> getTreeDocuments2() {
		return treeDocuments2;
	}

	public void setTreeDocuments2(List<TreeDocument> treeDocuments2) {
		this.treeDocuments2 = treeDocuments2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}