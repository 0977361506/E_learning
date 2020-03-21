package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Provine database table.
 * 
 */
@Entity
@Table(name = "Provine")

public class Provine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	//bi-directional many-to-one association to District
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDistrict")
	private District district;

	//bi-directional many-to-one association to Ward
	@OneToMany(mappedBy="provine")
	private List<Ward> wards;

	public Provine() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public List<Ward> getWards() {
		return this.wards;
	}

	public void setWards(List<Ward> wards) {
		this.wards = wards;
	}

	public Ward addWard(Ward ward) {
		getWards().add(ward);
		ward.setProvine(this);

		return ward;
	}

	public Ward removeWard(Ward ward) {
		getWards().remove(ward);
		ward.setProvine(null);

		return ward;
	}

}