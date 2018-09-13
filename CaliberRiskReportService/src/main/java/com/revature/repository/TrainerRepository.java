package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Trainer;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

}
