package com.revature.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Batches;

public interface Batch_Repo extends CassandraRepository<Batches, String>{
	@AllowFiltering
	public List<Batches> findByBatchid(int id);
	
	@AllowFiltering
	public List<Batches> findByTrainerid(int id);
	
	@AllowFiltering
	public List<Batches> findByEnddate(Date date);
	
	@AllowFiltering
	public List<Batches> findByPortfoliosubmissiondate(Date date);	

}
