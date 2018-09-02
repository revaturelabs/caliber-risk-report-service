package com.revature.model;

import java.sql.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Batches {
	@PrimaryKey(value="batch_id")
	private int batchid;
	@Column(value="trainer_id")
	private int trainerid;
	@Column(value="end_date")
	private Date enddate;
	@Column(value="portfolio_submission_date")
	private Date portfoliosubmissiondate;
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getPortfoliosubmissiondate() {
		return portfoliosubmissiondate;
	}
	public void setPortfoliosubmissiondate(Date portfoliosubmissiondate) {
		this.portfoliosubmissiondate = portfoliosubmissiondate;
	}
	@Override
	public String toString() {
		return "Batch [batchid=" + batchid + ", trainerid=" + trainerid + ", enddate=" + enddate
				+ ", portfoliosubmissiondate=" + portfoliosubmissiondate + "]";
	}
	public Batches(int batchid, int trainerid, Date enddate, Date portfoliosubmissiondate) {
		super();
		this.batchid = batchid;
		this.trainerid = trainerid;
		this.enddate = enddate;
		this.portfoliosubmissiondate = portfoliosubmissiondate;
	}
	public Batches() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
