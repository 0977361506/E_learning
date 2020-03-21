package com.vnpost.e_learning.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the PositionName database table.
 * 
 */
@Entity
@Table(name = "PositionName")

public class PositionName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String namePosition;

	@Lob
	private String requestContent;

	//bi-directional many-to-one association to CourseRequirement
	@OneToMany(mappedBy="positionName")
	private List<CourseRequirement> courseRequirements;

	//bi-directional many-to-one association to KindPositionName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idKindPosition")
	private KindPositionName kindPositionName;

	//bi-directional many-to-one association to RacingPositionName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRacing")
	private RacingPositionName racingPositionName;

	//bi-directional many-to-one association to RequirementTest
	@OneToMany(mappedBy="positionName")
	private List<RequirementTest> requirementTests;

	//bi-directional many-to-one association to TreePostion
	@OneToMany(mappedBy="positionName")
	private List<TreePostion> treePostions;

	public PositionName() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamePosition() {
		return this.namePosition;
	}

	public void setNamePosition(String namePosition) {
		this.namePosition = namePosition;
	}

	public String getRequestContent() {
		return this.requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public List<CourseRequirement> getCourseRequirements() {
		return this.courseRequirements;
	}

	public void setCourseRequirements(List<CourseRequirement> courseRequirements) {
		this.courseRequirements = courseRequirements;
	}

	public CourseRequirement addCourseRequirement(CourseRequirement courseRequirement) {
		getCourseRequirements().add(courseRequirement);
		courseRequirement.setPositionName(this);

		return courseRequirement;
	}

	public CourseRequirement removeCourseRequirement(CourseRequirement courseRequirement) {
		getCourseRequirements().remove(courseRequirement);
		courseRequirement.setPositionName(null);

		return courseRequirement;
	}

	public KindPositionName getKindPositionName() {
		return this.kindPositionName;
	}

	public void setKindPositionName(KindPositionName kindPositionName) {
		this.kindPositionName = kindPositionName;
	}

	public RacingPositionName getRacingPositionName() {
		return this.racingPositionName;
	}

	public void setRacingPositionName(RacingPositionName racingPositionName) {
		this.racingPositionName = racingPositionName;
	}

	public List<RequirementTest> getRequirementTests() {
		return this.requirementTests;
	}

	public void setRequirementTests(List<RequirementTest> requirementTests) {
		this.requirementTests = requirementTests;
	}

	public RequirementTest addRequirementTest(RequirementTest requirementTest) {
		getRequirementTests().add(requirementTest);
		requirementTest.setPositionName(this);

		return requirementTest;
	}

	public RequirementTest removeRequirementTest(RequirementTest requirementTest) {
		getRequirementTests().remove(requirementTest);
		requirementTest.setPositionName(null);

		return requirementTest;
	}

	public List<TreePostion> getTreePostions() {
		return this.treePostions;
	}

	public void setTreePostions(List<TreePostion> treePostions) {
		this.treePostions = treePostions;
	}

	public TreePostion addTreePostion(TreePostion treePostion) {
		getTreePostions().add(treePostion);
		treePostion.setPositionName(this);

		return treePostion;
	}

	public TreePostion removeTreePostion(TreePostion treePostion) {
		getTreePostions().remove(treePostion);
		treePostion.setPositionName(null);

		return treePostion;
	}

}