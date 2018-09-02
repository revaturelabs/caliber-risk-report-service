package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Survey_Reports;

public interface Survey_Reports_Repo extends CassandraRepository<Survey_Reports, String>{
	
	@AllowFiltering
	public List<Survey_Reports> findBySurveyid(int id);
	
	@AllowFiltering
	public List<Survey_Reports> findByTrainerid(int id);
	
	@AllowFiltering
	public List<Survey_Reports> findByBatchid(int id);
	
	@AllowFiltering
	public List<Survey_Reports> findByColor(String color);
}
