package com.revature.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Associate_Ratings {
	@PrimaryKey(value="report_id")
	private int reportid;
	@Column(value="associate_id")
	private int associateid;
	@Column(value="week_id")
	private int weekid;
	private String color;
	public int getReportid() {
		return reportid;
	}
	public void setReportid(int reportid) {
		this.reportid = reportid;
	}
	public int getAssociateid() {
		return associateid;
	}
	public void setAssociateid(int associateid) {
		this.associateid = associateid;
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
		return "Associate_Ratings [reportid=" + reportid + ", associateid=" + associateid + ", weekid=" + weekid
				+ ", Color=" + color + "]";
	}
	public Associate_Ratings(int reportid, int associateid, int weekid, String color) {
		super();
		this.reportid = reportid;
		this.associateid = associateid;
		this.weekid = weekid;
		this.color = color;
	}
	public Associate_Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
