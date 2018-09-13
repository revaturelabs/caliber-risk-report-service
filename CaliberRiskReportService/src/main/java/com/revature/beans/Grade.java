package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
<<<<<<< HEAD
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value="grade")
@Entity
@Table(name="Caliber_grade")
public class Grade {
	
	@Id
	@Column(name="grade_id")
	private Integer gradeId;
	
	@Column(name="Date_received")
	private Date date;
	
	@Column(name="score")
	private int score;
	
	@Column(name="Assessment_id")
	private int assessmentId;
	
	@Column(name="trainee_id")
	private int traineeId;

=======
 * TODO: add class description
 * 
 * @author TODO: add author for class
 */
@JsonRootName(value = "grade")
@Entity
@Table(name = "Caliber_grade")
public class Grade {

	@Id
	@Column(name = "grade_id")
	private Integer gradeId;

	@Column(name = "Date_received")
	private Date date;

	@Column(name = "score")
	private int score;

	@Column(name = "Assessment_id")
	private int assessmentId;

	@Column(name = "trainee_id")
	private int traineeId;

	/**
	 * Get unique identifier for this Grade
	 * 
	 * @return the id for this Grade
	 */
>>>>>>> juby
	public Integer getGradeId() {
		return gradeId;
	}

<<<<<<< HEAD
=======
	/**
	 * Sets the unique identifier for this Grade
	 * 
	 * @param gradeId the new id for this Grade
	 */
>>>>>>> juby
	public void setGradeId(Integer gradeId) {
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
