package com.ibm.healthplanner.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.healthplanner.spring.bean.CreatePatientResponse;
import com.ibm.healthplanner.spring.bean.GetPatientResponse;
import com.ibm.healthplanner.spring.bean.Patient;
import com.ibm.healthplanner.spring.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository userRepository;

	public void createUser(Patient user) {

		userRepository.save(user);
	}

	public GetPatientResponse getAllUser() {
		// TODO Auto-generated method stub
		
		GetPatientResponse data = new GetPatientResponse();
		data.setPatients((List<Patient>) userRepository.findAll());
		return data;
	}

	/*
	 * public Optional<User> findById(String id) { // TODO Auto-generated method
	 * stub return userRepository.findById(id);
	 * 
	 * }
	 */

	/*public Patient update(Patient user, String l) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}*/

	/*
	 * public void deleteUserById(String id) { // TODO Auto-generated method stub
	 * userRepository.delete(id); }
	 */
	/*
	 * public User updatePartially(User user, String id) { // TODO Auto-generated
	 * method stub User usr = findById(id); usr.setCountry(user.getCountry());
	 * return userRepository.save(usr); }
	 */



}
