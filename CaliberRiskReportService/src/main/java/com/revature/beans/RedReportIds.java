package com.revature.beans;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * TODO: class description
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

	public Set<UUID> getAssociates() {
		return associates;
	}

	public void setAssociates(Set<UUID> associates) {
		this.associates = associates;
	}

	public Set<UUID> getBatches() {
		return batches;
	}

	public void setBatches(Set<UUID> batches) {
		this.batches = batches;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "RedReportIds [associates=" + associates + ", batches=" + batches + ", time=" + time + "]";
	}
}
