 package com.cg.hims.controller;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.hims.entities.Policy;
import com.cg.hims.exceptions.PolicyNotFoundException;
//import com.cg.hims.service.IPolicyServiceImpl;
import com.cg.hims.service.IPolicyServiceImpl;

@RestController
public class IPolicyController {
	
	@Autowired
	private IPolicyServiceImpl serviceImpl;
	
	List<Policy> list;
	
	@PostMapping(value="/policy/add")
	public ResponseEntity<Policy> addPolicy(@RequestBody Policy policy) {
		Policy p1=serviceImpl.addPolicy(policy);
		ResponseEntity<Policy> res=new ResponseEntity<>(p1,HttpStatus.CREATED);
		return res;
	}
	
	@PutMapping(value="/policy/update")
	public ResponseEntity<Policy> updatePolicy(@RequestBody Policy p ) throws PolicyNotFoundException {
			Policy p1=serviceImpl.updatePolicy(p);
			ResponseEntity<Policy> re=new ResponseEntity<>(p1,HttpStatus.ACCEPTED);
			return re;
		}

	
	@RequestMapping(value="/policy/getPolicy/{pId}",method=RequestMethod.GET)
	public ResponseEntity<Policy> findPolicyById(@PathVariable int pId) throws PolicyNotFoundException {
		Policy p1=serviceImpl.findPolicyById(pId);
		ResponseEntity<Policy> res=new ResponseEntity<>(p1,HttpStatus.FOUND);
		return res;
	}

	@DeleteMapping(value="/policy/delete/{policyId}")
	public ResponseEntity<Policy> removePolicyById(@PathVariable int policyId) throws PolicyNotFoundException {
		Policy p1=serviceImpl.removePolicyById(policyId);
		ResponseEntity<Policy> res=new ResponseEntity<>(p1,HttpStatus.OK);
		return res;
	}

	@GetMapping(path="/policy/getPolicies")
	public ResponseEntity<List<Policy>> getAllPolicies() {
		list=new ArrayList<Policy>();
		list=serviceImpl.showAllPolicies();
		ResponseEntity<List<Policy>> response=new ResponseEntity<>(list,HttpStatus.FOUND);
		return response;
	}
} 