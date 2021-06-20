package com.cg.hims.entities;
 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;
import java.util.List;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;


@Component
@Entity
public class Agent {
    @Id
    @NotNull
    private int agentId;
    private String agentName;
    private String designation;
    private String salary;
    private String address;
	private String email;
    private String mobileNo;
    
    
    @OneToMany(mappedBy="agent",cascade=CascadeType.ALL)
    private List<PolicyHolder> policyHoldersList;
    
    
    @OneToMany(mappedBy="agent",cascade=CascadeType.ALL)

	private List<Policy> policies;
    public Agent()
    {
    	super();
    }

		
public Agent( int agentId, String agentName, String designation, String salary,String address,String email,String mobileNo) { 
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
		
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<PolicyHolder> getPolicyHoldersList() {
		return policyHoldersList;
	}

	public void setPolicyHoldersList(List<PolicyHolder> policyHoldersList) {
		this.policyHoldersList = policyHoldersList;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + ", designation=" + designation + ", salary="
				+ salary + ", address=" + address + ", email=" + email + ", mobileNo=" + mobileNo + ", getAgentId()="
				+ getAgentId() + ", getAgentName()=" + getAgentName() + ", getDesignation()=" + getDesignation()
				+ ", getSalary()=" + getSalary() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
				+ ", getMobileNo()=" + getMobileNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}