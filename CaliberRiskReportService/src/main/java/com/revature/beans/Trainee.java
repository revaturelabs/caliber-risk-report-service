package com.revature.beans;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "trainee")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Trainee {
	
	private UUID traineeId;
	
	private String traineeEmail;
	
	private String traineeName;
	
	private String trainingStatus;
	
	private int batchId;
	
	private String phoneNumber;
	
	private String profileUrl;
	
	private String skypeId;
	
	private String resourceId;
	
	private String recruiterName;
	
	private String college;
	
	private String degree;
	
	private String major;
	
	private String techScreenerName;
	
	private boolean revproProjectCompletion;
	
	private String flagNotes;
	
	private boolean flagStatus;
	
	private int techScreenScore;

	public UUID getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(UUID traineeId) {
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
