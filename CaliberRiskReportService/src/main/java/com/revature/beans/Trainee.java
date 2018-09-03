package com.revature.beans;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "trainee")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Trainee {
	
	@PrimaryKey("trainee_id")
	private int traineeId;
	
	@Column("trainee_email")
	private String traineeEmail;
	
	@Column("trainee_name")
	private String traineeName;
	
	@Column("training_status")
	private String trainingStatus;
	
	@Column("batch_id")
	private int batchId;
	
	@Column("phone_number")
	private String phoneNumber;
	
	@Column("profile_url")
	private String profileUrl;
	
	@Column("skype_id")
	private String skypeId;
	
	@Column("resource_id")
	private String resourceId;
	
	@Column("recruiter_name")
	private String recruiterName;
	
	@Column("college")
	private String college;
	
	@Column("degree")
	private String degree;
	
	@Column("major")
	private String major;
	
	@Column("tech_screener_name")
	private String techScreenerName;
	
	@Column("revpro_project_completion")
	private boolean revproProjectCompletion;
	
	@Column("flag_notes")
	private String flagNotes;
	
	@Column("flag_status")
	private boolean flagStatus;
	
	@Column("tech_screen_score")
	private int techScreenScore;
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeEmail() {
		return traineeEmail;
	}
	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}
	public String getTrainingName() {
		return traineeName;
	}
	public void setTrainingName(String trainingName) {
		this.traineeName = trainingName;
	}
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getTechScreenerName() {
		return techScreenerName;
	}
	public void setTechScreenerName(String techScreenerName) {
		this.techScreenerName = techScreenerName;
	}
	public boolean isRevproProjectCompletion() {
		return revproProjectCompletion;
	}
	public void setRevproProjectCompletion(boolean revproProjectCompletion) {
		this.revproProjectCompletion = revproProjectCompletion;
	}
	public String getFlagNotes() {
		return flagNotes;
	}
	public void setFlagNotes(String flagNotes) {
		this.flagNotes = flagNotes;
	}
	public boolean isFlagStatus() {
		return flagStatus;
	}
	public void setFlagStatus(boolean flagStatus) {
		this.flagStatus = flagStatus;
	}
	public int getTechScreenScore() {
		return techScreenScore;
	}
	public void setTechScreenScore(int techScreenScore) {
		this.techScreenScore = techScreenScore;
	}
}
