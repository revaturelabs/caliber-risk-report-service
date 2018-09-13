package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value="category")
@Entity
@Table(name="Caliber_category")
public class Category {
	
	@Id
	@Column(name="category_id")
	private Integer categoryId;
	
	@Column(name="skill_category")
	private String skillCategory;
	
	@Column(name="is_active")
	private boolean active;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getSkillCategory() {
		return skillCategory;
	}

	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
