package com.revature.beans;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * TODO: description
 * 
 * @author TODO: author
 *
 */
@JsonRootName(value = "batchweeklyreport")
@Table
public class BatchWeeklyReport {

	@PrimaryKeyColumn(name = "batch_id", type = PrimaryKeyType.PARTITIONED)
	private UUID id;

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
	private List<Integer> associates;

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

	@Column("category_name")
	private String categoryname;

	@PrimaryKeyColumn(name = "report_time", type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	private Date reporttime;
}
