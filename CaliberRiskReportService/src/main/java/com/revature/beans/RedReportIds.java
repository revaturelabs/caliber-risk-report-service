package com.revature.beans;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * TODO: class description
 * 
 * @author TODO: author
 *
 */
@Table
public class RedReportIds {
	@Column("Associate_ids")
	private Set<UUID> associates;

	@Column("Batch_ids")
	private Set<UUID> batches;

	@PrimaryKey("Report_time")
	private Date time;

	/**
	 * Get a Set of all Trainees in this RedReport
	 * 
	 * @return Set of Trainee ids
	 * @see Trainee
	 */
	public Set<UUID> getAssociates() {
		return associates;
	}

	/**
	 * Creates the Set of all Trainees in this RedReport
	 * 
	 * @param associates new Set of Trainee ids
	 * @see Trainee
	 */
	public void setAssociates(Set<UUID> associates) {
		this.associates = associates;
	}

	/**
	 * Get a Set of all batches in this RedReport
	 * 
	 * @return Set of batch ids
	 * @see RevBatch
	 */
	public Set<UUID> getBatches() {
		return batches;
	}

	/**
	 * Create a Set of all batches in this RedReport
	 * 
	 * @param batches new Set of batch ids
	 * @see RevBatch
	 */
	public void setBatches(Set<UUID> batches) {
		this.batches = batches;
	}

	/**
	 * Get the Date of this RedReport
	 * 
	 * @return the Date of this report
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * Set the Date of this RedReport
	 * 
	 * @param time new Date for this report
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "RedReportIds [associates=" + associates + ", batches=" + batches + ", time=" + time + "]";
	}
}
