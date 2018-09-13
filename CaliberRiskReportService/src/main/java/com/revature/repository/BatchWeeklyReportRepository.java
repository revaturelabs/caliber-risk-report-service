package com.revature.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.beans.BatchWeeklyReport;

public interface BatchWeeklyReportRepository extends CassandraRepository<BatchWeeklyReport, UUID> {
	
	BatchWeeklyReport findByIdnumAndReporttime(UUID idnum, Date reporttime);
	
	List<BatchWeeklyReport> findByIdnum(UUID idnum);

}
