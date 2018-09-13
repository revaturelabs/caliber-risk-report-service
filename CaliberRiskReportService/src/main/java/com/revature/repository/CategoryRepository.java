package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Category;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
