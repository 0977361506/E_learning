package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Groupposition database table.
 * 
 */
@Entity
@Table(name = "Groupposition")

public class Groupposition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String idUnit;

	private String nameGroup;

	//bi-directional many-to-one association to KindPositionName
	@OneToMany(mappedBy="groupposition")
	private List<KindPositionName> kindPositionNames;

	public Groupposition() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdUnit() {
		return this.idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public String getNameGroup() {
		return this.nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public List<KindPositionName> getKindPositionNames() {
		return this.kindPositionNames;
	}

	public void setKindPositionNames(List<KindPositionName> kindPositionNames) {
		this.kindPositionNames = kindPositionNames;
	}

	public KindPositionName addKindPositionName(KindPositionName kindPositionName) {
		getKindPositionNames().add(kindPositionName);
		kindPositionName.setGroupposition(this);

		return kindPositionName;
	}

	public KindPositionName removeKindPositionName(KindPositionName kindPositionName) {
		getKindPositionNames().remove(kindPositionName);
		kindPositionName.setGroupposition(null);

		return kindPositionName;
	}

}