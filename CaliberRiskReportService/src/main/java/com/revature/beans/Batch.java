package com.revature.beans;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="batch")
public class Batch {
	
	@PrimaryKey("batch_id")
	private int batchId;
	
	@Column("borderline_grade_threshold")
	private int blgt;
	
	@Column("end_date")
	private Date endDate;
	
	@Column("good_grade_threshold")
	private int ggt;
	
	@Column("location")
	private String location;
	
	@Column("skill_type")
	private String skilltype;
	
	@Column("start_date")
	private Date startDate;
	
	@Column("training_name")
	private String trainingName;
	
	@Column("training_type")
	private String trainingType;
	
	@Column("number_of_weeks")
	private int numberWeeks;
	
	@Column("co_trainer_id")
	private int coTrainerId;
	
	@Column("trainer_id")
	private int trainerId;
	
	@Column("resource_id")
	private String resourceId;
	
	@Column("address_id")
	private int addressId;
	
	@Column("graded_weeks")
	private int gradedWeeks;
	
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
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
}

