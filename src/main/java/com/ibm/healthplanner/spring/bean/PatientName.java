package com.ibm.healthplanner.spring.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;


public class PatientName {
	
	@JsonProperty("firstName")
	private String firstName ;
	
	@JsonProperty("lastName")
	private String lastName;
	
	public PatientName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public PatientName() {
		super();
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
