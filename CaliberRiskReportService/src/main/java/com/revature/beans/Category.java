package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * TODO: class description
 * @author TODO: author
 *
 */
@JsonRootName(value = "category")
@Entity
@Table(name = "Caliber_category")
public class Category {

	@Id
	@Column(name = "category_id")
	private Integer categoryId;

	@Column(name = "skill_category")
	private String skillCategory;

	@Column(name = "is_active")
	private boolean active;

	/**
	 * Returns the unique identifier for this Category
	 * 
	 * @return the id
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the unique identifier for this Category
	 * 
	 * @param categoryId the new id for this Category
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * TODO: add method description
	 * 
	 * @return TODO: add method return description
	 */
	public String getSkillCategory() {
		return skillCategory;
	}

	/**
	 * TODO: add method description
	 * 
	 * @param skillCategory TODO: add method parameter description
	 */
	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}

	/**
	 * Returns whether or not this Category is active
	 * 
	 * @return <code>true</code> if the category is active, <code>false</code> if it
	 *         is not
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Sets whether or not this Category is active
	 * 
	 * @param active <code>true</code> if the category is active, <code>false</code>
	 *               if it is not
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

}
