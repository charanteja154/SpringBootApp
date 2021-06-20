 package com.cg.hims.controller;

 
import java.util.List;
 
import java.util.Optional;

 
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import org.springframework.web.bind.annotation.RestController;

import com.cg.hims.entities.PolicyHolder;
import com.cg.hims.exceptions.PolicyHolderNotFoundException;
 
import com.cg.hims.service.IPolicyHolderService;

@RestController
public class PolicyHolderController {
	
	@Autowired
	private IPolicyHolderService policyHolderService;
	
	@RequestMapping(value="/PolicyHolder/all", method=RequestMethod.GET)
	public List<PolicyHolder> getAllPolicyHolder(){
		return policyHolderService.showAllPolicyHolder();
	}
	
	@RequestMapping(value= "/PolicyHolder/{id}", method= RequestMethod.GET)
    public PolicyHolder getPolicyHolderByPolicyHolderNameById(@PathVariable int id) throws PolicyHolderNotFoundException  {
    Optional<PolicyHolder> policyHolder =  policyHolderService.findPolicyHolderById(id);
           if(!policyHolder.isPresent()) {
   	       throw new PolicyHolderNotFoundException("PolicyHolder not found for this id : " + id);  
       
           }
           else
                 return policyHolder.get();        
     }

	
	@RequestMapping(value= "/PolicyHolder/add", method= RequestMethod.POST)
	public PolicyHolder addPolicyHolder( @RequestBody PolicyHolder newpolicyHolder) {       
	        return policyHolderService.addPolicyHolder(newpolicyHolder);
	}
	
	@RequestMapping(value= "/PolicyHolder/update/{id}", method= RequestMethod.PUT)
    public PolicyHolder updatePolicyHolder( @RequestBody PolicyHolder updpolicyHolder, @PathVariable int id) throws PolicyHolderNotFoundException {
        Optional<PolicyHolder> policyHolder =  policyHolderService.findPolicyHolderById(id);
        if (!policyHolder.isPresent()) {
            
                 throw new PolicyHolderNotFoundException("PolicyHolder not found for this id : " + id);
                

     }
     else  {
                 updpolicyHolder.setPolicyHolderId(id);
                 return policyHolderService.updatePolicyHolder(updpolicyHolder);
            }
    }
        
	@RequestMapping(value= "/PolicyHolder/remove/{id}", method= RequestMethod.DELETE)
	public void deletePolicyHolder(@PathVariable int id) throws PolicyHolderNotFoundException  {

	        Optional<PolicyHolder> policyHolder =  policyHolderService.findPolicyHolderById(id);
	        if(!policyHolder.isPresent()) {
	    	        throw new PolicyHolderNotFoundException("PolicyHolder not found for this id : " + id);
	    	        }
	    	        else  
                          policyHolderService.removePolicyHolder(id);
	}
	 
 
}

