package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the RacingPositionName database table.
 * 
 */
@Entity
@Table(name = "RacingPositionName")

public class RacingPositionName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String describes;

	private String racingName;

	//bi-directional many-to-one association to PositionName
	@OneToMany(mappedBy="racingPositionName")
	private List<PositionName> positionNames;

	public RacingPositionName() {
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

	public String getRacingName() {
		return this.racingName;
	}

	public void setRacingName(String racingName) {
		this.racingName = racingName;
	}

	public List<PositionName> getPositionNames() {
		return this.positionNames;
	}

	public void setPositionNames(List<PositionName> positionNames) {
		this.positionNames = positionNames;
	}

	public PositionName addPositionName(PositionName positionName) {
		getPositionNames().add(positionName);
		positionName.setRacingPositionName(this);

		return positionName;
	}

	public PositionName removePositionName(PositionName positionName) {
		getPositionNames().remove(positionName);
		positionName.setRacingPositionName(null);

		return positionName;
	}

}