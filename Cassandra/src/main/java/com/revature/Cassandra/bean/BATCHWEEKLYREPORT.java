package com.revature.Cassandra.bean;

import org.springframework.data.cassandra.mapping.PrimaryKey; 
import org.springframework.data.cassandra.mapping.Table;
import lombok.*;
import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BATCHWEEKLYREPORT{
	@PrimaryKey
	private int BATCH_ID;
	@PrimaryKey
	private Date REPORT_TIME;
	
	private String BATCH_NAME;
	private int QC_COUNT_GREEN;
	private int QC_COUNT_YELLOW;
	private int QC_COUNT_RED;
	private int QC_SCORE;
	private int SURVEY_COUNT_GREEN;
	private int SURVEY_COUNT_YELLOW;
	private int SURVEY_COUNT_RED;
	private int SURVEY_SCORE;
	private String TRAINER;
	private Set<Integer> ASSOCIATE_IDS;
	private String LOCATION;
	private String SKILLTYPE;
	private Date END_DATE;
	private int WEEKS;
	private int CURRENT_WEEK;
	private String CATEGORY_NAME;
}