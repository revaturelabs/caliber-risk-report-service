package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Assessment;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface AssessmentRepository extends JpaRepository<Assessment, Integer>{

}
