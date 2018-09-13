package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value="batch")
@Entity
@Table(name="Caliber_Batch")
public class RevBatch {
	
	@Id
	private Integer batchId;
	
	@Column(name="borderline_grade_threshold")
	private int blgt;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="good_grade_threshold")
	private int ggt;
	
	@Column(name="location")
	private String location;
	
	@Column(name="skill_type")
	private String skilltype;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="training_name")
	private String trainingName;
	
	@Column(name="training_type")
	private String trainingType;
	
	@Column(name="number_of_weeks")
	private int numberWeeks;
	
	@Column(name="co_trainer_id", nullable=true)
	private Integer coTrainerId;
	
	@Column(name="trainer_id")
	private Integer trainerId;
	
	@Column(name="resource_id", nullable=true)
	private String resourceId;
	
	@Column(name="address_id", nullable=true)
	private Integer addressId;
	
	@Column(name="graded_weeks", nullable=true)
	private int gradedWeeks;

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public int getBlgt() {
		return blgt;
	}

	public void setBlgt(int blgt) {
		this.blgt = blgt;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getGgt() {
		return ggt;
	}

	public void setGgt(int ggt) {
		this.ggt = ggt;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkilltype() {
		return skilltype;
	}

	public void setSkilltype(String skilltype) {
		this.skilltype = skilltype;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public int getNumberWeeks() {
		return numberWeeks;
	}

	public void setNumberWeeks(int numberWeeks) {
		this.numberWeeks = numberWeeks;
	}

	public int getCoTrainerId() {
		return coTrainerId;
	}

	public void setCoTrainerId(int coTrainerId) {
		this.coTrainerId = coTrainerId;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getGradedWeeks() {
		return gradedWeeks;
	}

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

