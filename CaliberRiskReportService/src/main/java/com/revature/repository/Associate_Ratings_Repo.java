package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Associate_Ratings;

public interface Associate_Ratings_Repo extends CassandraRepository<Associate_Ratings, String>{
	@AllowFiltering
	public List<Associate_Ratings> findByReportid(int id);
	
	@AllowFiltering
	public List<Associate_Ratings> findByAssociateid(int id);
	
	@AllowFiltering
	public List<Associate_Ratings> findByWeekid(int id);
	
	@AllowFiltering
	public List<Associate_Ratings> findByColor(String color);
}
