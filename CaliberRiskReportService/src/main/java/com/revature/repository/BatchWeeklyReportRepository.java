package com.revature.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.beans.BatchWeeklyReport;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface BatchWeeklyReportRepository extends CassandraRepository<BatchWeeklyReport, Integer> {
	
	BatchWeeklyReport findByIdnumAndReporttime(Integer idnum, Date reporttime);
	
	List<BatchWeeklyReport> findByIdnum(Integer idnum);

}
