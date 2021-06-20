  package com.cg.hims.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Policies_Table")
public class Policy {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int policyId;
	private String policyEffectiveDate;
	private String policyEndDate;
	private int policyTerm;
	private String policyStatus;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="quoteId")
	private Quote quote;
	@ManyToOne(cascade=CascadeType.ALL)
	private Agent agent;
	@OneToOne
	@JoinColumn(name="holderId")
	private PolicyHolder  policyHolder;
	
	public Policy() {
		super();
	}
	
	
	public Policy(int policyId, String policyEffectiveDate, String policyEndDate, int policyTerm, String policyStatus,
			Quote quote, Agent agent, PolicyHolder policyHolder) {
		super();
		this.policyId = policyId;
		this.policyEffectiveDate = policyEffectiveDate;
		this.policyEndDate = policyEndDate;
		this.policyTerm = policyTerm;
		this.policyStatus = policyStatus;
		this.quote = quote;
		this.agent = agent;
		this.policyHolder =policyHolder;
	}


	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(String policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public String getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(String policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public int getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(int policyTerm) {
		this.policyTerm = policyTerm;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public Quote getQuote() {
		return quote;
	}
	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public PolicyHolder getPolicyHolder() {
		return   policyHolder;
	}
	public void setPolicyHolder(PolicyHolder  policyHolder) {
		this.  policyHolder =   policyHolder;
	}


	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyEffectiveDate=" + policyEffectiveDate + ", policyEndDate="
				+ policyEndDate + ", policyTerm=" + policyTerm + ", policyStatus=" + policyStatus + ", quote=" + quote
				+ ", agent=" + agent + ", policyHolder=" + policyHolder + "]";
	}
	
}