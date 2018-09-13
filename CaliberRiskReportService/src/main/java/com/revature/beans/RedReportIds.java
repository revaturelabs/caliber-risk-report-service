package com.revature.beans;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
<<<<<<< HEAD
 * @author Mark Bedoya, David Martinez
=======
 * TODO: class description
 * 
 * @author TODO: author
>>>>>>> juby
 *
 */
@Table
public class RedReportIds {
	@Column("Associate_ids")
	private Set<UUID> associates;
<<<<<<< HEAD
	
	@Column("Batch_ids")
	private Set<UUID> batches;
	
	@PrimaryKey("Report_time")
	private Date time;

=======

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
>>>>>>> juby
	public Set<UUID> getAssociates() {
		return associates;
	}

<<<<<<< HEAD
=======
	/**
	 * Creates the Set of all Trainees in this RedReport
	 * 
	 * @param associates new Set of Trainee ids
	 * @see Trainee
	 */
>>>>>>> juby
	public void setAssociates(Set<UUID> associates) {
		this.associates = associates;
	}

<<<<<<< HEAD
=======
	/**
	 * Get a Set of all batches in this RedReport
	 * 
	 * @return Set of batch ids
	 * @see RevBatch
	 */
>>>>>>> juby
	public Set<UUID> getBatches() {
		return batches;
	}

<<<<<<< HEAD
=======
	/**
	 * Create a Set of all batches in this RedReport
	 * 
	 * @param batches new Set of batch ids
	 * @see RevBatch
	 */
>>>>>>> juby
	public void setBatches(Set<UUID> batches) {
		this.batches = batches;
	}

<<<<<<< HEAD
=======
	/**
	 * Get the Date of this RedReport
	 * 
	 * @return the Date of this report
	 */
>>>>>>> juby
	public Date getTime() {
		return time;
	}

<<<<<<< HEAD
=======
	/**
	 * Set the Date of this RedReport
	 * 
	 * @param time new Date for this report
	 */
>>>>>>> juby
	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "RedReportIds [associates=" + associates + ", batches=" + batches + ", time=" + time + "]";
	}
}
