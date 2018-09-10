package com.revature.beans;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * TODO: add class description
 * 
 * @author TODO: add author for class
 */
@JsonRootName(value = "grade")
public class Grade {

	private UUID gradeId;

	private Date date;

	private int score;

	private int assessmentId;

	private int traineeId;

	/**
	 * Get unique identifier for this Grade
	 * 
	 * @return the id for this Grade
	 */
	public UUID getGradeId() {
		return gradeId;
	}

	/**
	 * Sets the unique identifier for this Grade
	 * 
	 * @param gradeId the new id for this Grade
	 */
	public void setGradeId(UUID gradeId) {
		this.gradeId = gradeId;
	}

	/**
	 * Gets the Date of this Grade
	 * 
	 * @return the Date of this Grade
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the Date of this Grade
	 * 
	 * @param date the new Date of this Grade
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the score for this Grade
	 * 
	 * @return the score for this Grade
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Sets the score for this grade
	 * 
	 * @param score the new score for this grade
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * Gets the id for the {@link Assessment} associated with this Grade
	 * 
	 * @return the Assessment id
	 */
	public int getAssessmentId() {
		return assessmentId;
	}

	/**
	 * Sets a new {@link Assessment} id for this Grade
	 * 
	 * @param assessmentId the new Assessment id
	 */
	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	/**
	 * Gets the id for the (@link Trainee) associated with this Grade
	 * 
	 * @return the Trainee id
	 */
	public int getTraineeId() {
		return traineeId;
	}

	/**
	 * Sets a new ({@link Trainee} id for this Grade
	 * 
	 * @param traineeId the new Trainee id
	 */
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

}
