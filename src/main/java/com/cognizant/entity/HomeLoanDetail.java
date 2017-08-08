package com.cognizant.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOME_LOAN_DETAIL")
public class HomeLoanDetail {

	
	private String homeLoanId;
	private long accNo;
	private String homeLoanAccNo;
	private Double loanAmmount;
	private Date loanApplyDate;
	private long annualIncome;
	private String companyName;
	private String designation;
	private Double totalExp;
	private Double expCurrentCompany;
	
	@Id
	@Column(name="HOME_LOAN_ID")
	public String getHomeLoanId() {
		return homeLoanId;
	}
	public void setHomeLoanId(String str) {
		this.homeLoanId = str;
	}
	
	@Column(name="ACC_NO")
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	@Column(name="HOME_LOAN_ACC_NO")
	public String getHomeLoanAccNo() {
		return homeLoanAccNo;
	}
	public void setHomeLoanAccNo(String homeLoanAccNo) {
		this.homeLoanAccNo = homeLoanAccNo;
	}
	
	@Column(name="LOAN_AMOUNT")
	public Double getLoanAmmount() {
		return loanAmmount;
	}
	public void setLoanAmmount(Double loanAmmount) {
		this.loanAmmount = loanAmmount;
	}
	
	@Column(name="LOAN_APPLY_DT")
	public Date getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(Date loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}
	
	@Column(name="ANNUAL_INCOME")
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome2) {
		this.annualIncome = annualIncome2;
	}
	
	@Column(name="COMPANY_NAME")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Column(name="DESIGNATION")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Column(name="TOTAL_EXP")
	public Double getTotalExp() {
		return totalExp;
	}
	public void setTotalExp(Double totalExp) {
		this.totalExp = totalExp;
	}
	
	@Column(name="EXP_CURRENT_COMPANY")
	public Double getExpCurrentCompany() {
		return expCurrentCompany;
	}
	public void setExpCurrentCompany(Double expCurrentCompany) {
		this.expCurrentCompany = expCurrentCompany;
	}
	
}
