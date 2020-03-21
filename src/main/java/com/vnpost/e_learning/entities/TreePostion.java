package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TreePostion database table.
 * 
 */
@Entity
@Table(name = "TreePostion")

public class TreePostion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private long bigint;

	private String describes;

	private int levels;

	//bi-directional many-to-one association to PositionName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPositionname")
	private PositionName positionName;

	//bi-directional many-to-one association to Routeposition
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRouteposition")
	private Routeposition routeposition;

	public TreePostion() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBigint() {
		return this.bigint;
	}

	public void setBigint(long bigint) {
		this.bigint = bigint;
	}

	public String getDescribes() {
		return this.describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public int getLevels() {
		return this.levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public PositionName getPositionName() {
		return this.positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

	public Routeposition getRouteposition() {
		return this.routeposition;
	}

	public void setRouteposition(Routeposition routeposition) {
		this.routeposition = routeposition;
	}

}