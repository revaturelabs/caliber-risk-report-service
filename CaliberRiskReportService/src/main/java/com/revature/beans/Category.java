package com.revature.beans;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * TODO: add class description
 * 
 * @author TODO: add author
 */
@JsonRootName(value = "category")
public class Category {

	private UUID categoryId;

	private String skillCategory;

	private boolean active;

	/**
	 * Returns the unique identifier for this Category
	 * 
	 * @return the id of this Category
	 */
	public UUID getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the unique identifier for this Category
	 * 
	 * @param categoryId the new id for this Category
	 */
	public void setCategoryId(UUID categoryId) {
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
