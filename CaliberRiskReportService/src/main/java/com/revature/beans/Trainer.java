package com.revature.beans;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "trainer")
public class Trainer {

	private UUID trainerId;

	private String email;

	private String name;

	private String tier;

	private String title;

	private String password;

	/**
	 * Get the unique identifier for this Trainer
	 * 
	 * @return the id
	 */
	public UUID getTrainerId() {
		return trainerId;
	}

	/**
	 * Set the unique identifier for this Trainer
	 * 
	 * @param trainerId the new id
	 */
	public void setTrainerId(UUID trainerId) {
		this.trainerId = trainerId;
	}

	/**
	 * Get the email address for this Trainer
	 * 
	 * @return the email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email address for this Trainer
	 * 
	 * @param email the new email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the name of this Trainer
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this Trainer
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * TODO: what are tiers?
	 * 
	 * @return
	 */
	public String getTier() {
		return tier;
	}

	/**
	 * TODO: what are tiers?
	 * 
	 * @param tier
	 */
	public void setTier(String tier) {
		this.tier = tier;
	}

	/**
	 * TODO: title?
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * TODO: title
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get this Trainer's password
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set this Trainer's password
	 * 
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}