package com.revature.beans;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

public class Note {
	
	@PrimaryKey("note_id")
	private int noteId;
	
	@Column("note_content")
	private String noteContent;
	
	@Column("max_visibility")
	private int visibility;
	
	@Column("is_qc_feedback")
	private boolean qcFeedback;
	
	@Column("qc_status")
	private int qcStatus;
	
	@Column("note_type")
	private String noteType;
	
	@Column("week_number")
	private int weekNumber;
	
	@Column("batch_id")
	private int batchId;
	
	@Column("trainee_id")
	private int traineeId;
	
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public boolean isQcFeedback() {
		return qcFeedback;
	}
	public void setQcFeedback(boolean qcFeedback) {
		this.qcFeedback = qcFeedback;
	}
	public int getQcStatus() {
		return qcStatus;
	}
	public void setQcStatus(int qcStatus) {
		this.qcStatus = qcStatus;
	}
	public String getNoteType() {
		return noteType;
	}
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}
	public int getWeekNumber() {
		return weekNumber;
	}
	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
}
