package com.ibm.healthplanner.spring.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalAddress {

	public PostalAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("line1")
	private String line1;
	
	@JsonProperty("line2")
	private String line2;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("state")
	private String state;
	
	@JsonProperty("zip")
	private String zip;
	
	public PostalAddress(String line1, String line2, String city, String state, String zip) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@JsonProperty("line1")
	public String getLine1() {
		return line1;
	}

	@JsonProperty("line1")
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@JsonProperty("line2")
	public String getLine2() {
		return line2;
	}

	@JsonProperty("line2")
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("zip")
	public String getZip() {
		return zip;
	}

	@JsonProperty("zip")
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
