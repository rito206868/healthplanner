package com.ibm.healthplanner.spring.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("serial")
@Document(collection = "patients")
public class Patient  extends BaseEntity{

	@JsonProperty("patientName")
	private PatientName name;
	
	@JsonProperty("postalAddress")
	private PostalAddress address;
	
	private String dateOfBirth;
	
	private String mailId;
	private String phone;
	
	@JsonInclude(value=Include.NON_NULL)
	@JsonProperty("maritalStatus")
	private String maritalStatus = null;
	
	private List<String> medHistory;;
	
	
	public Patient(){
		
	}
	public Patient(PatientName name, PostalAddress address, String dateOfBirth, String mailId,
			String phone, String maritalStatus, List<String> medHistory ){
		super();
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.mailId = mailId;
		this.phone = phone;
		this.maritalStatus = maritalStatus;
		this.medHistory = medHistory;
	}
	public PatientName getName() {
		return name;
	}
	public void setName(PatientName name) {
		this.name = name;
		System.out.println("PatientName : "+name.toString() +"FirstName: "+name.getFirstName());
	}
	public PostalAddress getAddress() {
		return address;
	}
	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public List<String> getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(List<String> medHistory) {
		this.medHistory = medHistory;
	}
	
	private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
	
	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Patient {\n");
	    
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    address: ").append(toIndentedString(address)).append("\n");
	    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
	    sb.append("    mailId: ").append(toIndentedString(mailId)).append("\n");
	    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
	    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
	    sb.append("    medHistory: ").append(toIndentedString(medHistory)).append("\n");
	    
	    sb.append("}");
	    return sb.toString();
	  }
	
}
