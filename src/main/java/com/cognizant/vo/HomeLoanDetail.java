package com.cognizant.vo;

import java.util.Date;

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
	
	public String getHomeLoanId() {
		return homeLoanId;
	}
	public void setHomeLoanId(String str) {
		this.homeLoanId = str;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getHomeLoanAccNo() {
		return homeLoanAccNo;
	}
	public void setHomeLoanAccNo(String homeLoanAccNo) {
		this.homeLoanAccNo = homeLoanAccNo;
	}
	public Double getLoanAmmount() {
		return loanAmmount;
	}
	public void setLoanAmmount(Double loanAmmount) {
		this.loanAmmount = loanAmmount;
	}
	public Date getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(Date loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome2) {
		this.annualIncome = annualIncome2;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getTotalExp() {
		return totalExp;
	}
	public void setTotalExp(Double totalExp) {
		this.totalExp = totalExp;
	}
	public Double getExpCurrentCompany() {
		return expCurrentCompany;
	}
	public void setExpCurrentCompany(Double expCurrentCompany) {
		this.expCurrentCompany = expCurrentCompany;
	}
	
}
