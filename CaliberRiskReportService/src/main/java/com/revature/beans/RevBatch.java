package com.revature.beans;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="batch")
public class RevBatch {
	
	private UUID batchId;
	
	private int blgt;
	
	private Date endDate;
	
	private int ggt;
	
	private String location;
	
	private String skilltype;
	
	private Date startDate;
	
	private String trainingName;
	
	private String trainingType;
	
	private int numberWeeks;
	
	private int coTrainerId;
	
	private int trainerId;
	
	private String resourceId;
	
	private int addressId;
	
	private int gradedWeeks;

	public UUID getBatchId() {
		return batchId;
	}

	public void setBatchId(UUID batchId) {
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

