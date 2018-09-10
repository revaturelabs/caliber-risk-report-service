package com.revature.beans;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * TODO: description
 * 
 * @author TODO: author
 *
 */
@JsonRootName(value = "trainee")
@JsonIgnoreProperties(ignoreUnknown = true)
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

	/**
	 * Gets the unique identifier for this Trainee
	 * 
	 * @return the id of this Trainee
	 */
	public UUID getTraineeId() {
		return traineeId;
	}

	/**
	 * Sets the unique identifier for this Trainee
	 * 
	 * @param traineeId the new id of this Trainee
	 */
	public void setTraineeId(UUID traineeId) {
		this.traineeId = traineeId;
	}

	/**
	 * Gets the email address for this Trainee
	 * 
	 * @return the email address for this Trainee
	 */
	public String getTraineeEmail() {
		return traineeEmail;
	}

	/**
	 * Sets the email address for this Trainee
	 * 
	 * @param traineeEmail the new email address for this Trainee
	 */
	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}

	/**
	 * Gets the name of this Trainee
	 * 
	 * @return the name of this Trainee
	 */
	public String getTraineeName() {
		return traineeName;
	}

	/**
	 * Sets the name of this Trainee
	 * 
	 * @param traineeName the new name of this Trainee
	 */
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	/**
	 * TODO: what exactly is status?
	 * 
	 * @return
	 */
	public String getTrainingStatus() {
		return trainingStatus;
	}

	/**
	 * TODO: what exactly is status?
	 * 
	 * @param trainingStatus
	 */
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	/**
	 * Get the unique identifier corresponding to the batch for this Trainee
	 * 
	 * @return the batch id
	 * @see RevBatch
	 */
	public int getBatchId() {
		return batchId;
	}

	/**
	 * Set the unique identifier corresponding to the batch for this Trainee
	 * 
	 * @param batchId the new batch id
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	/**
	 * Get the phone number for this Trainee
	 * 
	 * @return the Trainee's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Set the phone number for this Trainee
	 * 
	 * @param phoneNumber the Trainee's new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the URL for the profile of this Trainee
	 * 
	 * @return this Trainee's profile URL
	 */
	public String getProfileUrl() {
		return profileUrl;
	}

	/**
	 * Sets the URL for the profile of this Trainee
	 * 
	 * @param profileUrl this Trainee's new profile URL
	 */
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	/**
	 * Get the Skype user name for this Trainee
	 * 
	 * @return this Trainee's Skype user name
	 */
	public String getSkypeId() {
		return skypeId;
	}

	/**
	 * Set the Skype user name for this Trainee
	 * 
	 * @param skypeId this Trainee's new Skype user name
	 */
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	/**
	 * TODO: resource id?
	 * 
	 * @return
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * TODO: resource id?
	 * 
	 * @param resourceId
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * Get the name of the recruiter for this Trainee
	 * 
	 * @return the recruiter's name
	 */
	public String getRecruiterName() {
		return recruiterName;
	}

	/**
	 * Set the name of the recruiter for this Trainee
	 * 
	 * @param recruiterName the new recruiter's name
	 */
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	/**
	 * Get the name of the college attended by this Trainee
	 * 
	 * @return the college's name
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * Set the name of the college attended by this Trainee
	 * 
	 * @param college the new college's name
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/**
	 * Get the type of degree (e.g BA, BS, etc.) earned by this Trainee
	 * 
	 * @return the degree type
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * Set the type of degree (e.g. BA, BS, etc) earned by this Trainee
	 * 
	 * @param degree the new degree type
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * Get the college major of this Trainee
	 * 
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Set the college major of this Trainee
	 * 
	 * @param major the new major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * Get the name of the technical screener for this Trainee
	 * 
	 * @return the screener's name
	 */
	public String getTechScreenerName() {
		return techScreenerName;
	}

	/**
	 * Set the name of the technical screener for this Trainee
	 * 
	 * @param techScreenerName the new screener's name
	 */
	public void setTechScreenerName(String techScreenerName) {
		this.techScreenerName = techScreenerName;
	}

	/**
	 * Get whether the RevaturePro project is completed
	 * 
	 * @return true if the project is completed, false otherwise
	 */
	public boolean isRevproProjectCompletion() {
		return revproProjectCompletion;
	}

	/**
	 * Set whether the RevaturePro project is completed
	 * 
	 * @param revproProjectCompletion true if the project is completed, false
	 *                                otherwise
	 */
	public void setRevproProjectCompletion(boolean revproProjectCompletion) {
		this.revproProjectCompletion = revproProjectCompletion;
	}

	/**
	 * TODO: flag notes?
	 * 
	 * @return
	 */
	public String getFlagNotes() {
		return flagNotes;
	}

	/**
	 * TODO: flag notes?
	 * 
	 * @param flagNotes
	 */
	public void setFlagNotes(String flagNotes) {
		this.flagNotes = flagNotes;
	}

	/**
	 * TODO: flag status?
	 * 
	 * @return
	 */
	public boolean isFlagStatus() {
		return flagStatus;
	}

	/**
	 * TODO: flag status?
	 * 
	 * @param flagStatus
	 */
	public void setFlagStatus(boolean flagStatus) {
		this.flagStatus = flagStatus;
	}

	/**
	 * Get this Trainee's score from the technical screening
	 * 
	 * @return the screening score
	 */
	public int getTechScreenScore() {
		return techScreenScore;
	}

	/**
	 * Set this Trainee's score from the technical screening
	 * 
	 * @param techScreenScore the new screening score
	 */
	public void setTechScreenScore(int techScreenScore) {
		this.techScreenScore = techScreenScore;
	}
}
