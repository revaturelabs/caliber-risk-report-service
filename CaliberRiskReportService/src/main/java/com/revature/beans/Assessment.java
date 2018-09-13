package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Mark Bedoya, David Martinez
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

	public Integer getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(Integer assessmentId) {
		this.assessmentId = assessmentId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
	
}
