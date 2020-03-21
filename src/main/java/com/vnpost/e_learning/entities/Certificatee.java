package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the Certificatee database table.
 * 
 */
@Entity
@Table(name = "Certificatee")

public class Certificatee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private int status_Certificatee;

	private Date timeCreate;

	private String urlCertificatee;

	//bi-directional many-to-one association to RoundTest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRoundTest")
	private RoundTest roundTest;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public Certificatee() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getStatus_Certificatee() {
		return status_Certificatee;
	}

	public void setStatus_Certificatee(int status_Certificatee) {
		this.status_Certificatee = status_Certificatee;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public String getUrlCertificatee() {
		return urlCertificatee;
	}

	public void setUrlCertificatee(String urlCertificatee) {
		this.urlCertificatee = urlCertificatee;
	}

	public RoundTest getRoundTest() {
		return roundTest;
	}

	public void setRoundTest(RoundTest roundTest) {
		this.roundTest = roundTest;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}