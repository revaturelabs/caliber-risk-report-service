package com.revature.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Survey_Reports {
	@PrimaryKey(value="survey_id")
	private int surveyid;
	@Column(value="trainer_id")
	private int trainerid;
	@Column(value="batch_id")
	private int batchid;
	private String color;
	private String comment;
	@Override
	public String toString() {
		return "Survey_Reports [survey_id=" + surveyid + ", trainer_id=" + trainerid + ", batch_id=" + batchid
				+ ", color=" + color + ", comment=" + comment + "]";
	}
	public int getSurvey_id() {
		return surveyid;
	}
	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public int getBatchid() {
		return batchid;
	}
	public void setBatch_id(int batchid) {
		this.batchid = batchid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Survey_Reports(int surveyid, int trainerid, int batchid, String color, String comment) {
		super();
		this.surveyid = surveyid;
		this.trainerid = trainerid;
		this.batchid = batchid;
		this.color = color;
		this.comment = comment;
	}
	public Survey_Reports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
