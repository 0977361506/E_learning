package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the District database table.
 * 
 */
@Entity
@Table(name = "District")

public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	//bi-directional many-to-one association to Provine
	@OneToMany(mappedBy="district")
	private List<Provine> provines;

	public District() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getName() {
		return this.name;
	}

	public List<Provine> getProvines() {
		return provines;
	}

	public void setProvines(List<Provine> provines) {
		this.provines = provines;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setName(String name) {
		this.name = name;
	}



}