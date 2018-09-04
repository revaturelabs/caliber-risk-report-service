package com.revature.beans;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="trainer")
@Table
public class Trainer {
	
	@PrimaryKey("trainer_id")
	private UUID trainerId;
	
	@Column("email")
	private String email;
	
	@Column("name")
	private String name;
	
	@Column("tier")
	private String tier;
	
	@Column("title")
	private String title;
	
	@Column("trainer_password")
	private String password;

	public UUID getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(UUID trainerId) {
		this.trainerId = trainerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
