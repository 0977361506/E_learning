package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Permistion database table.
 * 
 */
@Entity
@Table(name = "Permistion")

public class Permistion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String codename;

	private String namePermistion;

	//bi-directional many-to-one association to DetailPermisstion
	@OneToMany(mappedBy="permistion")
	private List<DetailPermisstion> detailPermisstions;

	//bi-directional many-to-one association to TreePermistion
	@OneToMany(mappedBy="permistion1")
	private List<TreePermistion> treePermistions1;

	//bi-directional many-to-one association to TreePermistion
	@OneToMany(mappedBy="permistion2")
	private List<TreePermistion> treePermistions2;

	//bi-directional many-to-one association to UserPermistion
	@OneToMany(mappedBy="permistion")
	private List<UserPermistion> userPermistions;

	public Permistion() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodename() {
		return this.codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public String getNamePermistion() {
		return this.namePermistion;
	}

	public void setNamePermistion(String namePermistion) {
		this.namePermistion = namePermistion;
	}

	public List<DetailPermisstion> getDetailPermisstions() {
		return this.detailPermisstions;
	}

	public void setDetailPermisstions(List<DetailPermisstion> detailPermisstions) {
		this.detailPermisstions = detailPermisstions;
	}

	public DetailPermisstion addDetailPermisstion(DetailPermisstion detailPermisstion) {
		getDetailPermisstions().add(detailPermisstion);
		detailPermisstion.setPermistion(this);

		return detailPermisstion;
	}

	public DetailPermisstion removeDetailPermisstion(DetailPermisstion detailPermisstion) {
		getDetailPermisstions().remove(detailPermisstion);
		detailPermisstion.setPermistion(null);

		return detailPermisstion;
	}

	public List<TreePermistion> getTreePermistions1() {
		return this.treePermistions1;
	}

	public void setTreePermistions1(List<TreePermistion> treePermistions1) {
		this.treePermistions1 = treePermistions1;
	}

	public TreePermistion addTreePermistions1(TreePermistion treePermistions1) {
		getTreePermistions1().add(treePermistions1);
		treePermistions1.setPermistion1(this);

		return treePermistions1;
	}

	public TreePermistion removeTreePermistions1(TreePermistion treePermistions1) {
		getTreePermistions1().remove(treePermistions1);
		treePermistions1.setPermistion1(null);

		return treePermistions1;
	}

	public List<TreePermistion> getTreePermistions2() {
		return this.treePermistions2;
	}

	public void setTreePermistions2(List<TreePermistion> treePermistions2) {
		this.treePermistions2 = treePermistions2;
	}

	public TreePermistion addTreePermistions2(TreePermistion treePermistions2) {
		getTreePermistions2().add(treePermistions2);
		treePermistions2.setPermistion2(this);

		return treePermistions2;
	}

	public TreePermistion removeTreePermistions2(TreePermistion treePermistions2) {
		getTreePermistions2().remove(treePermistions2);
		treePermistions2.setPermistion2(null);

		return treePermistions2;
	}

	public List<UserPermistion> getUserPermistions() {
		return this.userPermistions;
	}

	public void setUserPermistions(List<UserPermistion> userPermistions) {
		this.userPermistions = userPermistions;
	}

	public UserPermistion addUserPermistion(UserPermistion userPermistion) {
		getUserPermistions().add(userPermistion);
		userPermistion.setPermistion(this);

		return userPermistion;
	}

	public UserPermistion removeUserPermistion(UserPermistion userPermistion) {
		getUserPermistions().remove(userPermistion);
		userPermistion.setPermistion(null);

		return userPermistion;
	}

}