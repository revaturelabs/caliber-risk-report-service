package com.revature.beans;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="assessment")
public class Assessment {
	
	@PrimaryKey("assessment_id")
	private int assessmentId;
	
	@Column("raw_score")
	private int score;
	
	@Column("assessment_title")
	private String title;
	
	@Column("assessment_type")
	private String type;
	
	@Column("week_number")
	private int week;
	
	@Column("batch_id")
	private int batchId;
	
	@Column("assessment_category")
	private int category;
	
	public int getId() {
		return assessmentId;
	}
	public void setId(int id) {
		this.assessmentId = id;
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
