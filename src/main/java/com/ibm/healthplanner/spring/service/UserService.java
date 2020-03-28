package com.ibm.healthplanner.spring.service;

import java.util.List;

import com.ibm.healthplanner.spring.bean.GetPatientResponse;
import com.ibm.healthplanner.spring.bean.Patient;

public interface UserService {
	public void createUser(Patient user);
	public GetPatientResponse getAllUser();
	
	
	//public User findById(String id);
	//public Patient update(Patient user, String l);
	//public void deleteUserById(String id);
	//public User updatePartially(User user, String id);
}
