package com.ibm.healthplanner.spring.controller;




import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ibm.healthplanner.spring.bean.CreatePatientResponse;
import com.ibm.healthplanner.spring.bean.GetPatientResponse;
import com.ibm.healthplanner.spring.bean.Patient;
import com.ibm.healthplanner.spring.service.UserService;

import io.swagger.annotations.Api;
@RestController
@CrossOrigin(origins="*")
@RequestMapping(value={"/","/user"})
@Api(value="onlinestore", description="Operations pertaining to Health Advisor")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping(value="/",produces = MediaType.APPLICATION_JSON_VALUE)
	public String get(){
		return "Please give url as Spring-Boot-Rest/user/get";
		
	}
	/*
	 * @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	 * public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
	 * System.out.println("Fetching User with id " + id); User user =
	 * userService.findById(id); if (user == null) { return new
	 * ResponseEntity<User>(HttpStatus.NOT_FOUND); } return new
	 * ResponseEntity<User>(user, HttpStatus.OK); }
	 */
    
	 @PostMapping(value="/create",headers="Accept=application/json")
	 public ResponseEntity<Void> createUser(@RequestBody Patient patient, UriComponentsBuilder ucBuilder){
	     System.out.println("Creating User "+patient.getName());
	     String id = "P" + "-" + System.currentTimeMillis();
	     patient.setId(id);
	     userService.createUser(patient);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(patient.getId()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }

	 @GetMapping(value="/get", headers="Accept=application/json")
	 public GetPatientResponse getAllUser() {		 
		GetPatientResponse tasks = userService.getAllUser();
	  return tasks;
	
	 }

	/*
	 * @PutMapping(value="/update", headers="Accept=application/json") public
	 * ResponseEntity<String> updateUser(@RequestBody User currentUser) {
	 * System.out.println("sd"); User user =
	 * userService.findById(currentUser.getId()); if (user==null) { return new
	 * ResponseEntity<String>(HttpStatus.NOT_FOUND); }
	 * userService.update(currentUser, currentUser.getId()); return new
	 * ResponseEntity<String>(HttpStatus.OK); }
	 * 
	 * @DeleteMapping(value="/{id}", headers ="Accept=application/json") public
	 * ResponseEntity<User> deleteUser(@PathVariable("id") String id){ User user =
	 * userService.findById(id); if (user == null) { return new
	 * ResponseEntity<User>(HttpStatus.NOT_FOUND); } userService.deleteUserById(id);
	 * return new ResponseEntity<User>(HttpStatus.NO_CONTENT); }
	 */
	/*
	 * @PatchMapping(value="/{id}", headers="Accept=application/json") public
	 * ResponseEntity<User> updateUserPartially(@PathVariable("id") String
	 * id, @RequestBody User currentUser){ User user = userService.findById(id);
	 * if(user ==null){ return new ResponseEntity<User>(HttpStatus.NOT_FOUND); }
	 * User usr = userService.updatePartially(currentUser, id); return new
	 * ResponseEntity<User>(usr, HttpStatus.OK); }
	 */
}
