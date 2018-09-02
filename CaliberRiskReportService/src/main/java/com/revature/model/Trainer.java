package com.revature.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Trainer {
	@PrimaryKey(value="trainer_id")
	private int trainerid;
	@Column(value="trainer_name")
	private String trainername;
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", trainername=" + trainername + "]";
	}
	public Trainer(int trainerid, String trainername) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
