package com.cg.hims.entities;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Component
@Entity
public class PolicyHolder {
	
	@Id
	@GeneratedValue
	private int policyHolderId;
	private String policyHolderName;
	private String policyName;
	private String premiumType;
	private String creditCard;
	private String dob;
	private String occupation;
	private double annualIncome;
	private String isRetired;
	private String ssn;
	private String emailId;
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	private HomeAddress address;
	@JsonIgnore
	@JoinColumn
	@ManyToOne(cascade=CascadeType.ALL)
	private Agent agent;
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Policy> policy = new HashSet<>();
	
	public PolicyHolder()
	{
		super();
	}
	public PolicyHolder(int policyHolderId, String policyHolderName, String policyName, String premiumType,
			String creditCard, String dob, String occupation, double annualIncome, String isRetired, String ssn,
			String emailId, HomeAddress address, Agent agent, User user, Set<Policy> policy) {
		super();
		this.policyHolderId = policyHolderId;
		this.policyHolderName = policyHolderName;
		this.policyName = policyName;
		this.premiumType = premiumType;
		this.creditCard = creditCard;
		this.dob = dob;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.isRetired = isRetired;
		this.ssn = ssn;
		this.emailId = emailId;
		this.address = address;
		this.agent = agent;
		this.user = user;
		this.policy = policy;
	}
	public int getPolicyHolderId() {
		return policyHolderId;
	}
	public void setPolicyHolderId(int policyHolderId) {
		this.policyHolderId = policyHolderId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getIsRetired() {
		return isRetired;
	}
	public void setIsRetired(String isRetired) {
		this.isRetired = isRetired;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public HomeAddress getAddress() {
		return address;
	}
	public void setAddress(HomeAddress address) {
		this.address = address;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Policy> getPolicy() {
		return policy;
	}
	public void setPolicy(Set<Policy> policy) {
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "PolicyHolder [policyHolderId=" + policyHolderId + ", policyHolderName=" + policyHolderName
				+ ", policyName=" + policyName + ", premiumType=" + premiumType + ", creditCard=" + creditCard
				+ ", dob=" + dob + ", occupation=" + occupation + ", annualIncome=" + annualIncome + ", isRetired="
				+ isRetired + ", ssn=" + ssn + ", emailId=" + emailId + ", address=" + address + ", agent=" + agent
				+ ", user=" + user + ", policy=" + policy + "]";
	}
	
	
	 
	
	 
	
	
	

	

}
