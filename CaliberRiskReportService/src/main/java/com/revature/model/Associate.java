package com.revature.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Associate {
	@PrimaryKey(value="associate_id")
	private int associateid;
	@Column(value="batch_id")
	private int batchid;
	@Column(value="overall_color")
	private String overallcolor;
	private String name;
	@Column(value="portfolio_status")
	private String portfoliostatus;
	public int getAssociateid() {
		return associateid;
	}
	public void setAssociateid(int associateid) {
		this.associateid = associateid;
	}
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getOverallcolor() {
		return overallcolor;
	}
	public void setOverallcolor(String overallcolor) {
		this.overallcolor = overallcolor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPortfoliostatus() {
		return portfoliostatus;
	}
	public void setPortfoliostatus(String portfoliostatus) {
		this.portfoliostatus = portfoliostatus;
	}
	@Override
	public String toString() {
		return "Associate [associateid=" + associateid + ", batchid=" + batchid + ", overallcolor=" + overallcolor
				+ ", name=" + name + ", portfoliostatus=" + portfoliostatus + "]";
	}
	public Associate(int associateid, int batchid, String overallcolor, String name, String portfoliostatus) {
		super();
		this.associateid = associateid;
		this.batchid = batchid;
		this.overallcolor = overallcolor;
		this.name = name;
		this.portfoliostatus = portfoliostatus;
	}
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
