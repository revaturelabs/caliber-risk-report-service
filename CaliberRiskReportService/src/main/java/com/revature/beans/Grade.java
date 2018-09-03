package com.revature.beans;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="grade")
public class Grade {
	
	@PrimaryKey("grade_id")
	private int gradeId;
	
	@Column("date_recieved")
	private Date date;
	
	@Column("score")
	private int score;
	
	@Column("assessment_id")
	private int assessmentId;
	
	@Column("trainee_id")
	private int traineeId;
	
	
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
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
