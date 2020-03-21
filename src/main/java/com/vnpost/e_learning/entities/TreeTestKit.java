package com.vnpost.e_learning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the TreeTestKit database table.
 * 
 */
@Entity
@Table(name = "TreeTestKit")

public class TreeTestKit implements Serializable {
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
	private Date lastUpdate;

	private Date timeCreate;

	//bi-directional many-to-one association to TestKit
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTestKidOne")
	private TestKit testKit1;

	//bi-directional many-to-one association to TestKit
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTestKidTwo")
	private TestKit testKit2;

	public TreeTestKit() {
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

	public TestKit getTestKit1() {
		return this.testKit1;
	}

	public void setTestKit1(TestKit testKit1) {
		this.testKit1 = testKit1;
	}

	public TestKit getTestKit2() {
		return this.testKit2;
	}

	public void setTestKit2(TestKit testKit2) {
		this.testKit2 = testKit2;
	}

}