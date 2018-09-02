package com.revature.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class QC_Report {
	@PrimaryKey(value="report_id")
	private int reportid;
	@Column(value="trainer_id")
	private int trainerid;
	@Column(value="batch_id")
	private int batchid;
	private String color;
	private String comment;
	public QC_Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QC_Report(int reportid, int trainerid, int batchid, String color, String comment) {
		super();
		this.reportid = reportid;
		this.trainerid = trainerid;
		this.batchid = batchid;
		this.color = color;
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "QC_report [report_id=" + reportid + ", trainer_id=" + trainerid + ", batch_id=" + batchid
				+ ", color=" + color + ", comment=" + comment + "]";
	}
	public int getReportid() {
		return reportid;
	}
	public void setReportid(int reportid) {
		this.reportid = reportid;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
