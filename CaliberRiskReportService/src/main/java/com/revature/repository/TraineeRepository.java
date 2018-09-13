package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Trainee;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface TraineeRepository extends JpaRepository<Trainee, Integer>{

}
