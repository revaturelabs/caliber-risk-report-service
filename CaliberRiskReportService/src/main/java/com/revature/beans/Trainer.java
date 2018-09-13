package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
<<<<<<< HEAD
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value="trainer")
@Entity
@Table(name="Caliber_trainer")
public class Trainer {
	
	@Id
	@Column(name="trainer_id")
	private Integer trainerId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	@Column(name="tier")
	private String tier;
	
	@Column(name="title")
	private String title;
	
	@Column(name="trainer_password")
	private String password;

=======
 * TODO: class description
 * 
 * @author TODO: author
 *
 */
@JsonRootName(value = "trainer")
@Entity
@Table(name = "Caliber_trainer")
public class Trainer {

	@Id
	@Column(name = "trainer_id")
	private Integer trainerId;

	@Column(name = "email")
	private String email;

	@Column(name = "name")
	private String name;

	@Column(name = "tier")
	private String tier;

	@Column(name = "title")
	private String title;

	@Column(name = "trainer_password")
	private String password;

	/**
	 * Get the unique identifier for this Trainer
	 * 
	 * @return the id
	 */
>>>>>>> juby
	public Integer getTrainerId() {
		return trainerId;
	}

<<<<<<< HEAD
=======
	/**
	 * Set the unique identifier for this Trainer
	 * 
	 * @param trainerId the new id
	 */
>>>>>>> juby
	public void setTrainerId(Integer trainerId) {
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