package com.revature.Cassandra.bean;

import org.springframework.data.cassandra.mapping.PrimaryKey; 
import org.springframework.data.cassandra.mapping.Table;
import lombok.*;
import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class REDREPORT{
	
	@PrimaryKey
	private Date REPORT_TIME;
	
	private Set<Integer> ASSOCIATE_IDS;
	private Set<Integer> BATCH_IDS;
}