package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the StatisticalAction database table.
 * 
 */
@Entity
@Table(name = "StatisticalAction")

public class StatisticalAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private Date lastUpdate;

	private String nameStatistical;

	private Date timeCreate;

	private Date timeUp;

	private String urlStatistical;

	//bi-directional many-to-one association to Method
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMethod")
	private Method method;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUser")
	private User user;

	public StatisticalAction() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNameStatistical() {
		return this.nameStatistical;
	}

	public void setNameStatistical(String nameStatistical) {
		this.nameStatistical = nameStatistical;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Date getTimeUp() {
		return this.timeUp;
	}

	public void setTimeUp(Date timeUp) {
		this.timeUp = timeUp;
	}

	public String getUrlStatistical() {
		return this.urlStatistical;
	}

	public void setUrlStatistical(String urlStatistical) {
		this.urlStatistical = urlStatistical;
	}

	public Method getMethod() {
		return this.method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}