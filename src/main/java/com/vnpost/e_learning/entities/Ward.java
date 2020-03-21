package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Ward database table.
 * 
 */
@Entity
@Table(name = "Ward")

public class Ward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="ward")
	private List<User> users;

	//bi-directional many-to-one association to Provine
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idProvine")
	private Provine provine;

	public Ward() {
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

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setWard(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setWard(null);

		return user;
	}

	public Provine getProvine() {
		return this.provine;
	}

	public void setProvine(Provine provine) {
		this.provine = provine;
	}

}