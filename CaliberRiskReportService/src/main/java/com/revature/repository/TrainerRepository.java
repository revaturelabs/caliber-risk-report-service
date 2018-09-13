package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

}
