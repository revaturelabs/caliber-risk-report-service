package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
<<<<<<< HEAD
 * @author Mark Bedoya, David Martinez
=======
 * TODO: class description
 * @author TODO: author
>>>>>>> juby
 *
 */
@JsonRootName(value="assessment")
@Entity
@Table(name="Caliber_assessment")
public class Assessment {
	
	@Id
	@Column(name="assessment_id")
	private Integer assessmentId;
	
	@Column(name="Raw_Score")
	private int score;
	
	@Column(name="Assessment_title")
	private String title;
	
	@Column(name="Assessment_type")
	private String type;
	
	@Column(name="Week_number")
	private int week;
	
	@Column(name="Batch_id")
	private int batchId;
	
	@Column(name="Assessment_category")
	private int category;

<<<<<<< HEAD
=======
	/**
	 * Gets the unique identifier for this Assessment
	 * 
	 * @return the id
	 */
>>>>>>> juby
	public Integer getAssessmentId() {
		return assessmentId;
	}

<<<<<<< HEAD
=======
	/**
	 * Sets the unique identifier for this Assessment
	 * 
	 * @param assessmentId the new id
	 */
>>>>>>> juby
	public void setAssessmentId(Integer assessmentId) {
		this.assessmentId = assessmentId;
	}

	/**
	 * Gets the score for this Assessment
	 * 
	 * @return the score for this Assessment
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Sets the score for this Assessment
	 * 
	 * @param score the new score for this Assessment
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * Gets the title for this Assessment
	 * 
	 * @return the title for this Assessment
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title for this Assessment
	 * 
	 * @param title the new title for this Assessment
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the type of this Assessment
	 * 
	 * @return String representing the Assessment type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type of this Assessment
	 * 
	 * @param type String representing the new Assessment type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the week number for this Assessment
	 * 
	 * @return the week number of this Assessment
	 */
	public int getWeek() {
		return week;
	}

	/**
	 * Sets the week number for this Assessment
	 * 
	 * @param week the new week number of this Assessment
	 */
	public void setWeek(int week) {
		this.week = week;
	}

	/**
	 * Gets the unique identifier for the batch associated with this Assessment
	 * 
	 * @return the id of the batch associated with this Assessment
	 * @see RevBatch
	 */
	public int getBatchId() {
		return batchId;
	}

	/**
	 * Sets the unique identifier for the batch associated with this Assessment
	 * 
	 * @param batchId the id of the new batch associated with this Assessment
	 * @see RevBatch
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	/**
	 * Gets the unique identifier for the {@link Category} associated with this
	 * Assessment
	 * 
	 * @return the id for the Category associated with this Assessment
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * Sets the unique identifier for the {@link Category} associated with this
	 * Assessment
	 * 
	 * @param category the id for the new Category associated with this Assessment
	 */
	public void setCategory(int category) {
		this.category = category;
	}

}
