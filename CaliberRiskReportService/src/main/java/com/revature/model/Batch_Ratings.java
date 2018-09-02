package com.revature.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Batch_Ratings {
	@PrimaryKey(value="report_id")
	private int reportid;
	@Column(value="batch_id")
	private int batchid;
	@Column(value="week_id")
	private int weekid;
	private String color;
	public int getReportid() {
		return reportid;
	}
	public void setReportid(int reportid) {
		this.reportid = reportid;
	}
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public int getWeekid() {
		return weekid;
	}
	public void setWeekid(int weekid) {
		this.weekid = weekid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Batch_Ratings [reportid=" + reportid + ", batchid=" + batchid + ", weekid=" + weekid + ", color="
				+ color + "]";
	}
	public Batch_Ratings(int reportid, int batchid, int weekid, String color) {
		super();
		this.reportid = reportid;
		this.batchid = batchid;
		this.weekid = weekid;
		this.color = color;
	}
	public Batch_Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}	
}