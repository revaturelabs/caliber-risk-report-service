package com.revature.beans;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="grade")
public class Grade {
	
	private UUID gradeId;
	
	private Date date;
	
	private int score;
	
	private int assessmentId;
	
	private int traineeId;

	public UUID getGradeId() {
		return gradeId;
	}

	public void setGradeId(UUID gradeId) {
		this.gradeId = gradeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	
}
