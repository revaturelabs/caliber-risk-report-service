package com.revature.beans;

import java.util.Date;
import java.util.Set;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value = "batchweeklyreport")
@Table
public class BatchWeeklyReport {

	@PrimaryKeyColumn(name = "batch_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private Integer idnum;

	@Column("batch_name")
	private String batchName;

	@Column("qc_count_green")
	private int qcgreens;

	@Column("qc_count_yellow")
	private int qcyellow;

	@Column("qc_count_red")
	private int qcred;

	@Column("qc_score")
	private int qcscore;

	@Column("survey_count_green")
	private int survgreen;

	@Column("survey_count_yellow")
	private int survyellow;

	@Column("survey_count_red")
	private int survred;

	@Column("survey_score")
	private int survscore;

	@Column("trainer")
	private String trainer;

	@Column("associate_ids")
	private Set<Integer> associates;

	@Column("location")
	private String location;

	@Column("skilltype")
	private String skilltype;

	@Column("end_date")
	private Date enddate;

	@Column("weeks")
	private int weeks;

	@Column("current_week")
	private int currweek;

	@PrimaryKeyColumn(name="category_name", type= PrimaryKeyType.CLUSTERED, ordinal = 2)
	private String categoryname;

	@PrimaryKeyColumn(name = "report_time", type = PrimaryKeyType.CLUSTERED, ordinal = 1, ordering = Ordering.DESCENDING)
	private Date reporttime;

	public Integer getIdnum() {
		return idnum;
	}

	public void setIdnum(Integer idnum) {
		this.idnum = idnum;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public int getQcgreens() {
		return qcgreens;
	}

	public void setQcgreens(int qcgreens) {
		this.qcgreens = qcgreens;
	}

	public int getQcyellow() {
		return qcyellow;
	}

	public void setQcyellow(int qcyellow) {
		this.qcyellow = qcyellow;
	}

	public int getQcred() {
		return qcred;
	}

	public void setQcred(int qcred) {
		this.qcred = qcred;
	}

	public int getQcscore() {
		return qcscore;
	}

	public void setQcscore(int qcscore) {
		this.qcscore = qcscore;
	}

	public int getSurvgreen() {
		return survgreen;
	}

	public void setSurvgreen(int survgreen) {
		this.survgreen = survgreen;
	}

	public int getSurvyellow() {
		return survyellow;
	}

	public void setSurvyellow(int survyellow) {
		this.survyellow = survyellow;
	}

	public int getSurvred() {
		return survred;
	}

	public void setSurvred(int survred) {
		this.survred = survred;
	}

	public int getSurvscore() {
		return survscore;
	}

	public void setSurvscore(int survscore) {
		this.survscore = survscore;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Set<Integer> getAssociates() {
		return associates;
	}

	public void setAssociates(Set<Integer> associates) {
		this.associates = associates;
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

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getWeeks() {
		return weeks;
	}

	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}

	public int getCurrweek() {
		return currweek;
	}

	public void setCurrweek(int currweek) {
		this.currweek = currweek;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Date getReporttime() {
		return reporttime;
	}

	public void setReporttime(Date reporttime) {
		this.reporttime = reporttime;
	}

	@Override
	public String toString() {
		return "BatchWeeklyReport [id=" + idnum + ", batchName=" + batchName + ", qcgreens=" + qcgreens + ", qcyellow="
				+ qcyellow + ", qcred=" + qcred + ", qcscore=" + qcscore + ", survgreen=" + survgreen + ", survyellow="
				+ survyellow + ", survred=" + survred + ", survscore=" + survscore + ", trainer=" + trainer
				+ ", associates=" + associates + ", location=" + location + ", skilltype=" + skilltype + ", enddate="
				+ enddate + ", weeks=" + weeks + ", currweek=" + currweek + ", categoryname=" + categoryname
				+ ", reporttime=" + reporttime + "]";
	}
	
	/**
	 * 
	 * @author William Scott
	 * @return
	 */
	public boolean isRed() {
		return qcscore <= 40;
	}
}
