package com.revature.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.beans.AssociateWeeklyReport;
import com.revature.beans.BatchWeeklyReport;

public interface AssociateWeeklyReportRepository extends CassandraRepository<AssociateWeeklyReport, UUID> {

	List<AssociateWeeklyReport> findByassId(UUID uuid);
}
