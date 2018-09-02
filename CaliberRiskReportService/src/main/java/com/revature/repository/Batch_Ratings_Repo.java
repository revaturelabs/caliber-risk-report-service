package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Batch_Ratings;

public interface Batch_Ratings_Repo extends CassandraRepository<Batch_Ratings, String>{
	@AllowFiltering
	public List<Batch_Ratings> findByReportid(int id);
	
	@AllowFiltering
	public List<Batch_Ratings> findByBatchid(int id);
	
	@AllowFiltering
	public List<Batch_Ratings> findByWeekid(int id);
	
	@AllowFiltering
	public List<Batch_Ratings> findByColor(String color);
}
