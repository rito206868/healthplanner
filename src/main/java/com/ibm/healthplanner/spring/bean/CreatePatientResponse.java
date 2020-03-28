package com.ibm.healthplanner.spring.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePatientResponse {
	
	@JsonProperty("patients")
	private List<Patient> patients = new ArrayList<Patient>();
	
	public CreatePatientResponse patients(List<Patient> patients) {
	    this.patients = patients;
	    return this;
	  }
	
	public CreatePatientResponse addPatient(Patient selectedPatient) {
	    if (this.patients == null) {
	      this.patients = new ArrayList<Patient>();
	    }
	    this.patients.add(selectedPatient);
	    return this;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	
	
	

}
