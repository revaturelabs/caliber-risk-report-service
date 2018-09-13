package com.revature.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.beans.AssociateWeeklyReport;
import com.revature.beans.BatchWeeklyReport;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface AssociateWeeklyReportRepository extends CassandraRepository<AssociateWeeklyReport, Integer> {

	List<AssociateWeeklyReport> findByassId(Integer id);
}
