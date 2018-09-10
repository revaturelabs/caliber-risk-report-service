package com.revature.beans;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class AssociateWeeklyReport {
	
	@Column("Associate_email")
	private String email;
	
	@Column("Associate_name")
	private String name;
	
	@Column("Associate_id")
	private Integer assId;
	
	@Column("Batch_id")
	private Integer idnum;
	
	@Column("Training_status")
	private String status;
	
	@Column("Qc_score")
	private int qcscore;
	
	@Column("Qc_count_redweeks")
	private int qcred;
	
	@Column("current_week")
	private int week;
	
	@Column("skilltype")
	private String skill;
	
	@Column("phone_number")
	private String phone;
	
	@Column("profile_url")
	private String profileurl;
	
	@Column("Flag_status")
	private String flagstatus;
	
	@PrimaryKey("report_time")
	private Date reporttime;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAssId() {
		return assId;
	}

	public void setAssId(Integer assId) {
		this.assId = assId;
	}

	public Integer getIdnum() {
		return idnum;
	}

	public void setIdnum(Integer idnum) {
		this.idnum = idnum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQcscore() {
		return qcscore;
	}

	public void setQcscore(int qcscore) {
		this.qcscore = qcscore;
	}

	public int getQcred() {
		return qcred;
	}

	public void setQcred(int qcred) {
		this.qcred = qcred;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfileurl() {
		return profileurl;
	}

	public void setProfileurl(String profileurl) {
		this.profileurl = profileurl;
	}

	public String getFlagstatus() {
		return flagstatus;
	}

	public void setFlagstatus(String flagstatus) {
		this.flagstatus = flagstatus;
	}

	public Date getReporttime() {
		return reporttime;
	}

	public void setReporttime(Date reporttime) {
		this.reporttime = reporttime;
	}

	@Override
	public String toString() {
		return "AssociateWeeklyReport [email=" + email + ", name=" + name + ", assId=" + assId + ", idnum=" + idnum
				+ ", status=" + status + ", qcscore=" + qcscore + ", qcred=" + qcred + ", week=" + week + ", skill="
				+ skill + ", phone=" + phone + ", profileurl=" + profileurl + ", flagstatus=" + flagstatus
				+ ", reporttime=" + reporttime + "]";
	}
	
	
}
