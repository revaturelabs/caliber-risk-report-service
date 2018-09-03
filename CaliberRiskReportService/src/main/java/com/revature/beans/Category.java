package com.revature.beans;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="category")
public class Category {
	
	@PrimaryKey("category_id")
	private int categoryId;
	
	@Column("skill_category")
	private String skillCategory;
	
	@Column("is_active")
	private boolean active;
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
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
