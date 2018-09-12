package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * TODO: description
 * 
 * @author TODO: author
 *
 */
@JsonRootName(value = "batch")
@Entity
@Table(name = "Caliber_Batch")
public class RevBatch {

	@Id
	private Integer batchId;

	@Column(name = "borderline_grade_threshold")
	private int blgt;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "good_grade_threshold")
	private int ggt;

	@Column(name = "location")
	private String location;

	@Column(name = "skill_type")
	private String skilltype;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "training_name")
	private String trainingName;

	@Column(name = "training_type")
	private String trainingType;

	@Column(name = "number_of_weeks")
	private int numberWeeks;

	@Column(name = "co_trainer_id", nullable = true)
	private Integer coTrainerId;

	@Column(name = "trainer_id")
	private Integer trainerId;

	@Column(name = "resource_id", nullable = true)
	private String resourceId;

	@Column(name = "address_id", nullable = true)
	private Integer addressId;

	@Column(name = "graded_weeks", nullable = true)
	private int gradedWeeks;

	/**
	 * Gets the unique identifier for this batch.
	 * 
	 * @return the id of this batch
	 */
	public Integer getBatchId() {
		return batchId;
	}

	/**
	 * Sets the unique identifier for this batch.
	 * 
	 * @param batchId
	 */
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	/**
	 * TODO: I have no idea what this is
	 * 
	 * @return TODO: whatever this is
	 */
	public int getBlgt() {
		return blgt;
	}

	/**
	 * TODO: Set whatever this is
	 * 
	 * @param blgt TODO: the new whatever this is
	 */
	public void setBlgt(int blgt) {
		this.blgt = blgt;
	}

	/**
	 * Get the end Date for this batch.
	 * 
	 * @return the end Date for this batch
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the end Date for this batch.
	 * 
	 * @param endDate the end Date for this batch
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * TODO: whatever this is
	 * 
	 * @return TODO: whatever this is
	 */
	public int getGgt() {
		return ggt;
	}

	/**
	 * TODO: set whatever this is
	 * 
	 * @param ggt TODO: the new whatever this is
	 */
	public void setGgt(int ggt) {
		this.ggt = ggt;
	}

	/**
	 * Get the location for this batch
	 * 
	 * @return the location for this batch
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set the location for this batch
	 * 
	 * @param location the new location for this batch
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the skill type for this batch. TODO: get a more detailed description
	 * 
	 * @return the skill type for this batch
	 */
	public String getSkilltype() {
		return skilltype;
	}

	/**
	 * Sets the skill type for this batch. TODO: get a more detailed description
	 * 
	 * @param skilltype the skill type for this batch.
	 */
	public void setSkilltype(String skilltype) {
		this.skilltype = skilltype;
	}

	/**
	 * Gets the start Date for this batch.
	 * 
	 * @return the start Date for this batch.
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start Date for this batch.
	 * 
	 * @param startDate the start Date for this batch.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * TODO: training name?
	 * 
	 * @return TODO: training name?
	 */
	public String getTrainingName() {
		return trainingName;
	}

	/**
	 * TODO: training name?
	 * 
	 * @param trainingName TODO: training name?
	 */
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	/**
	 * Get the type of training for this batch.
	 * 
	 * @return the type of training for this batch.
	 */
	public String getTrainingType() {
		return trainingType;
	}

	/**
	 * Set the type of training for this batch.
	 * 
	 * @param trainingType the new type of training for this batch.
	 */
	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	/**
	 * Get the number of weeks this batch will run.
	 * 
	 * @return the number of weeks this batch will run.
	 */
	public int getNumberWeeks() {
		return numberWeeks;
	}

	/**
	 * Sets the number of weeks this batch will run.
	 * 
	 * @param numberWeeks the new number of weeks this batch will run.
	 */
	public void setNumberWeeks(int numberWeeks) {
		this.numberWeeks = numberWeeks;
	}

	/**
	 * Get the unique identifier for the co-trainer
	 * 
	 * @return the id for the co-trainer
	 */
	public int getCoTrainerId() {
		return coTrainerId;
	}

	/**
	 * Set the unique identifier for the co-trainer
	 * 
	 * @param coTrainerId the id for the new co-trainer
	 */
	public void setCoTrainerId(int coTrainerId) {
		this.coTrainerId = coTrainerId;
	}

	/**
	 * Get the unique identifier for the trainer
	 * 
	 * @return the id for the trainer
	 */
	public int getTrainerId() {
		return trainerId;
	}

	/**
	 * Set the unique identifier for the trainer
	 * 
	 * @param trainerId the id for the new trainer
	 */
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	/**
	 * TODO: resource id?
	 * 
	 * @return TODO: resource id?
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * TODO: resource id?
	 * 
	 * @param resourceId TODO: resource id?
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * Gets the unique identifier corresponding to the Address for this batch.
	 * 
	 * @return the id for the Address
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * Sets the unique identifier corresponding to the Address for this batch.
	 * 
	 * @param addressId the id for the new Address
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * TODO: not sure what this is
	 * 
	 * @return
	 */
	public int getGradedWeeks() {
		return gradedWeeks;
	}

	/**
	 * TODO: not sure what this is
	 * 
	 * @param gradedWeeks
	 */
	public void setGradedWeeks(int gradedWeeks) {
		this.gradedWeeks = gradedWeeks;
	}

	@Override
	public String toString() {
		return "RevBatch [batchId=" + batchId + ", blgt=" + blgt + ", endDate=" + endDate + ", ggt=" + ggt
				+ ", location=" + location + ", skilltype=" + skilltype + ", startDate=" + startDate + ", trainingName="
				+ trainingName + ", trainingType=" + trainingType + ", numberWeeks=" + numberWeeks + ", coTrainerId="
				+ coTrainerId + ", trainerId=" + trainerId + ", resourceId=" + resourceId + ", addressId=" + addressId
				+ ", gradedWeeks=" + gradedWeeks + "]";
	}

}
