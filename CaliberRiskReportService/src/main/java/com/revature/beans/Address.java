package com.revature.beans;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Mark Bedoya, David Martinez
 *
 */
@JsonRootName(value="address")
public class Address {
	
	private Integer addressId;
	
	private String addressStreet;

	private String addressCity;

	private String addressState;

	private String addressZipcode;

	private String addressCompany;

	private boolean active;

	/**
	 * Gets the unique identifier for this Address
	 * 
	 * @return the id of this Address
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * Sets the unique identifier for this Address
	 * 
	 * @param addressId the id of this Address
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/**
	 * Gets the street name for this Address
	 * 
	 * @return the street name for this Address
	 */
	public String getAddressStreet() {
		return addressStreet;
	}

	/**
	 * Sets the street name for this Address
	 * 
	 * @param addressStreet the new street name for this Address
	 */
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	/**
	 * Gets the city for this Address
	 * 
	 * @return the city for this Address
	 */
	public String getAddressCity() {
		return addressCity;
	}

	/**
	 * Sets the city for this Address
	 * 
	 * @param addressCity the new city for this Address
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	/**
	 * Gets the state for this Address
	 * 
	 * @return the state for this Address
	 */
	public String getAddressState() {
		return addressState;
	}

	/**
	 * Sets the city for this Address
	 * 
	 * @param addressState the new state for this address
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	/**
	 * Gets the zipcode for this Address
	 * 
	 * @return the zipcode for this Address
	 */
	public String getAddressZipcode() {
		return addressZipcode;
	}

	/**
	 * Sets the zipcode for this Address
	 * 
	 * @param addressZipcode the new zipcode for this Address
	 */
	public void setAddressZipcode(String addressZipcode) {
		this.addressZipcode = addressZipcode;
	}

	/**
	 * Gets the company name for this Address
	 * 
	 * @return the company name for this Address
	 */
	public String getAddressCompany() {
		return addressCompany;
	}

	/**
	 * Sets the company name for this Address
	 * 
	 * @param addressCompany the new company name for this Address
	 */
	public void setAddressCompany(String addressCompany) {
		this.addressCompany = addressCompany;
	}

	/**
	 * Returns whether or not this Address is active
	 * 
	 * @return <code>true</code> if the Address is active, <code>false</code> if not
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Sets whether or not this Address is active
	 * 
	 * @param active <code>true</code> if the Address is active, <code>false</code>
	 *               if not
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

}
