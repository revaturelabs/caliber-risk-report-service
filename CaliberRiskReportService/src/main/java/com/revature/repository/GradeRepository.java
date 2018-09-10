package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer>{

}
