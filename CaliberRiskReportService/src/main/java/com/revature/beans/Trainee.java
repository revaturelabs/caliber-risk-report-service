package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value = "trainee")
@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
@Table(name="Caliber_Trainee")
public class Trainee {
	
	@Id
	@Column(name="trainee_id")
	private Integer traineeId;
	
	@Column(name="trainee_email")
	private String traineeEmail;
	
	@Column(name="trainee_name")
	private String traineeName;
	
	@Column(name="training_status")
	private String trainingStatus;
	
	@Column(name="batch_id")
	private Integer batchId;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="profile_url")
	private String profileUrl;
	
	@Column(name="skype_id")
	private String skypeId;
	
	@Column(name="Resource_id")
	private String resourceId;
	
	@Column(name="recruiter_name")
	private String recruiterName;
	
	@Column(name="college")
	private String college;
	
	@Column(name="degree")
	private String degree;
	
	@Column(name="major")
	private String major;
	
	@Column(name="tech_screener_name")
	private String techScreenerName;
	
	@Column(name="revpro_project_completion")
	private Integer revproProjectCompletion;
	
	@Column(name="flag_notes")
	private String flagNotes;
	
	@Column(name="flag_status")
	private String flagStatus;
	
	@Column(name="tech_screen_score")
	private Integer techScreenScore;

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeEmail() {
		return traineeEmail;
	}

	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
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

	public Integer isRevproProjectCompletion() {
		return revproProjectCompletion;
	}

	public void setRevproProjectCompletion(Integer revproProjectCompletion) {
		this.revproProjectCompletion = revproProjectCompletion;
	}

	public String getFlagNotes() {
		return flagNotes;
	}

	public void setFlagNotes(String flagNotes) {
		this.flagNotes = flagNotes;
	}

	public String getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(String flagStatus) {
		this.flagStatus = flagStatus;
	}

	public int getTechScreenScore() {
		return techScreenScore;
	}

	public void setTechScreenScore(int techScreenScore) {
		this.techScreenScore = techScreenScore;
	}
}
