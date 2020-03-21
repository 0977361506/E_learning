package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Routeposition database table.
 * 
 */
@Entity
@Table(name = "Routeposition")

public class Routeposition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String describe;

	private String name;

	//bi-directional many-to-one association to TreePostion
	@OneToMany(mappedBy="routeposition")
	private List<TreePostion> treePostions;

	public Routeposition() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TreePostion> getTreePostions() {
		return this.treePostions;
	}

	public void setTreePostions(List<TreePostion> treePostions) {
		this.treePostions = treePostions;
	}

	public TreePostion addTreePostion(TreePostion treePostion) {
		getTreePostions().add(treePostion);
		treePostion.setRouteposition(this);

		return treePostion;
	}

	public TreePostion removeTreePostion(TreePostion treePostion) {
		getTreePostions().remove(treePostion);
		treePostion.setRouteposition(null);

		return treePostion;
	}

}