package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Trainer;

public interface Trainer_Repo extends CassandraRepository<Trainer, String>{
	@AllowFiltering
	public List<Trainer> findByTrainerid(int id);
	
	@AllowFiltering
	public List<Trainer> findByTrainername(String name);
}
