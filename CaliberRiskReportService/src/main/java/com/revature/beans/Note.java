package com.revature.beans;

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
@JsonRootName(value="note")
@Entity
@Table(name="Caliber_note")
public class Note {
	
	@Id
	@Column(name="Note_id")
	private Integer noteId;
	
	@Column(name="Note_content")
	private String noteContent;
	
	@Column(name="max_visibility")
	private int visibility;
	
	@Column(name="is_qc_feedback")
	private boolean qcFeedback;
	
	@Column(name="qc_status")
	private int qcStatus;
	
	@Column(name="note_type")
	private String noteType;
	
	@Column(name="week_number")
	private int weekNumber;
	
	@Column(name="batch_id")
	private int batchId;
	
	@Column(name="trainee_id")
	private int traineeId;

	/**
	 * Gets the unique identifier associated with this Note
	 * 
	 * @return the id of this Note
	 */
	public Integer getNoteId() {
		return noteId;
	}

	/**
	 * Sets the unique identifier associate with this Note
	 * 
	 * @param noteId the new id of this Note
	 */
	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	/**
	 * Gets the contents of this Note
	 * 
	 * @return the contents of this Note
	 */
	public String getNoteContent() {
		return noteContent;
	}

	/**
	 * Sets the contents of this Note
	 * 
	 * @param noteContent the contents of this Note
	 */
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	/**
	 * Returns whether or not this Note contains QC feedback
	 * 
	 * @return <code>true</code> if this Note contains QC feedback,
	 *         <code>false</code> if not
	 */
	public boolean isQcFeedback() {
		return qcFeedback;
	}

	/**
	 * Sets whether or not this Note contains QC feedback
	 * 
	 * @param <code>true</code> if this Note contains QC feedback,
	 *        <code>false</code> if not
	 */
	public void setQcFeedback(boolean qcFeedback) {
		this.qcFeedback = qcFeedback;
	}

	public int getQcStatus() {
		return qcStatus;
	}

	public void setQcStatus(int qcStatus) {
		this.qcStatus = qcStatus;
	}

	/**
	 * Gets the type of this Note
	 * 
	 * @return a String containing the type of this Note
	 */
	public String getNoteType() {
		return noteType;
	}

	/**
	 * Sets the type of this Note
	 * 
	 * @param noteType a String containing the new type of this Note
	 */
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}

	/**
	 * Gets the week number for this Note
	 * 
	 * @return the week number of this Note
	 */
	public int getWeekNumber() {
		return weekNumber;
	}

	/**
	 * Sets the week number for this Note
	 * 
	 * @param weekNumber the new week number of this Note
	 */
	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}

	/**
	 * Gets the unique identifier for the batch associated with this note
	 * 
	 * @return the id of the batch for this Note
	 * @see RevBatch
	 */
	public int getBatchId() {
		return batchId;
	}

	/**
	 * Sets the unique identifier for the batch associated with this Note
	 * 
	 * @param batchId the id of the new batch for this Note
	 * @see RevBatch
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	/**
	 * Gets the unique identifier for the {@link Trainee} associated with this Note
	 * 
	 * @return the id of the Trainee for this Note
	 */
	public int getTraineeId() {
		return traineeId;
	}

	/**
	 * Sets the unique identifier for the {@link Trainee} associated with this Note
	 * 
	 * @param traineeId the id of the new Trainee for this Note
	 */
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

}
