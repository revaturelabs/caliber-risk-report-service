package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.QC_Report;


public interface QC_report_repo extends CassandraRepository<QC_Report, String> {
	@AllowFiltering
	public List<QC_Report> findByReportid(int id);
	
	@AllowFiltering
	public List<QC_Report> findByTrainerid(int id);
	
	@AllowFiltering
	public List<QC_Report> findByBatchid(int id);
	
	@AllowFiltering
	public List<QC_Report> findByColor(String color);
	
}
