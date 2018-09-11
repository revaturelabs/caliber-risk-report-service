package com.revature.Cassandra.bean;

import org.springframework.data.cassandra.mapping.PrimaryKey; 
import org.springframework.data.cassandra.mapping.Table;
import lombok.*;
import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ASSOCIATEWEEKLYREPORT{
	@PrimaryKey
	private int ASSOCIATE_ID; 
	
	@PrimaryKey
	private Date REPRORT_TIME;
	
	private String ASSOCIATE_EMAIL;
	private String ASSOCIATE_NAME;
	private int BATCH_ID;
	private String TRAINING_STATUS;
	private int QC_SCORE;
	private int QC_COUNT_REDWEEKS;
	private int CURRENT_WEEK;
	private String SKILLTYPE;
	private String PHONE_NUMBER;
	private String PROFILE_URL;
	private String FLAG_STATUS;
}