package com.cognizant.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDUCATION_LOAN_DETAIL")
public class EducationLoanDetail {

	private long eduLoanId;
	private String accNo;
	private String eduLoanAccNo;
	private Double eduLoanAmmount;
	private Date eduLoanApplyDate;
	private Double eduLoanDuration;
	private Double fatherAnnualIncome;
	private Double courseFee;
	private String courseName;
	private String fatherName;
	private String idCardNumber;
	
	@Id
	@Column(name="EDU_LOAN_ID")
	public long getEduLoanId() {
		return eduLoanId;
	}
	public void setEduLoanId(long eduLoanId) {
		this.eduLoanId = eduLoanId;
	}
	
	@Column(name="ACC_NO")
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	@Column(name="EDU_LOAN_ACC_NO")
	public String getEduLoanAccNo() {
		return eduLoanAccNo;
	}
	public void setEduLoanAccNo(String eduLoanAccNo) {
		this.eduLoanAccNo = eduLoanAccNo;
	}
	
	@Column(name="EDU_LOAN_AMOUNT")
	public Double getEduLoanAmmount() {
		return eduLoanAmmount;
	}
	public void setEduLoanAmmount(Double eduLoanAmmount) {
		this.eduLoanAmmount = eduLoanAmmount;
	}
	
	@Column(name="EDU_LOAN_APPLY_DT")
	public Date getEduLoanApplyDate() {
		return eduLoanApplyDate;
	}
	public void setEduLoanApplyDate(Date eduLoanApplyDate) {
		this.eduLoanApplyDate = eduLoanApplyDate;
	}
	
	@Column(name="EDU_LOAN_DURATION")
	public Double getEduLoanDuration() {
		return eduLoanDuration;
	}
	public void setEduLoanDuration(Double eduLoanDuration) {
		this.eduLoanDuration = eduLoanDuration;
	}
	
	@Column(name="FATHER_ANNUAL_INCOME")
	public Double getFatherAnnualIncome() {
		return fatherAnnualIncome;
	}
	public void setFatherAnnualIncome(Double fatherAnnualIncome) {
		this.fatherAnnualIncome = fatherAnnualIncome;
	}
	
	@Column(name="COURSE_FEE")
	public Double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}
	
	@Column(name="COURSE_NAME")
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Column(name="FATHER_NAME")
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	@Column(name="ID_CARD_NUMBER")
	public String getIdCardNumber() {
		return idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}
}
