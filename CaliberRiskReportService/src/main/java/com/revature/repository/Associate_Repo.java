package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Associate;

public interface Associate_Repo extends CassandraRepository<Associate, String>{
	@AllowFiltering
	public List<Associate> findByAssociateid(int id);
	
	@AllowFiltering
	public List<Associate> findByBatchid(int id);
	
	@AllowFiltering
	public List<Associate> findByOverallcolor(String color);
	
	@AllowFiltering
	public List<Associate> findByName(String name);
	
	@AllowFiltering
	public List<Associate> findByPortfoliostatus(String status);
}
