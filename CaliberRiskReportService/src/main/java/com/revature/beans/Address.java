package com.revature.beans;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="address")
@Table
public class Address {
	
	@PrimaryKey("Address_Id")
	private int addressId;
	
	@Column("address_street")
	private String addressStreet;
	
	@Column("address_city")
	private String addressCity;
	
	@Column("address_state")
	private String addressState;
	
	@Column("address_zipcode")
	private String addressZipcode;
	
	@Column("address_company")
	private String addressCompany;
	
	@Column("active")
	private boolean active;
	
	public int getId() {
		return addressId;
	}
	public void setId(int id) {
		this.addressId = id;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	public String getAddressZipcode() {
		return addressZipcode;
	}
	public void setAddressZipcode(String addressZipcode) {
		this.addressZipcode = addressZipcode;
	}
	public String getAddressCompany() {
		return addressCompany;
	}
	public void setAddressCompany(String addressCompany) {
		this.addressCompany = addressCompany;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
