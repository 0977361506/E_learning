package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the KindPositionName database table.
 * 
 */
@Entity
@Table(name = "KindPositionName")

public class KindPositionName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String namePostion;

	//bi-directional many-to-one association to Groupposition
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idGroupposition")
	private Groupposition groupposition;

	//bi-directional many-to-one association to PositionName
	@OneToMany(mappedBy="kindPositionName")
	private List<PositionName> positionNames;

	public KindPositionName() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamePostion() {
		return this.namePostion;
	}

	public void setNamePostion(String namePostion) {
		this.namePostion = namePostion;
	}

	public Groupposition getGroupposition() {
		return this.groupposition;
	}

	public void setGroupposition(Groupposition groupposition) {
		this.groupposition = groupposition;
	}

	public List<PositionName> getPositionNames() {
		return this.positionNames;
	}

	public void setPositionNames(List<PositionName> positionNames) {
		this.positionNames = positionNames;
	}

	
}