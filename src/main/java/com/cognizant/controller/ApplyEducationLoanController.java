package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.service.ApplyEducationLoanService;
import com.cognizant.vo.EducationLoanDetail;
import com.cognizant.vo.TransactionDetail;

public class ApplyEducationLoanController {
	
	@Autowired
	private ApplyEducationLoanService applyEducationLoanService;
	
	@RequestMapping(value = "/launchapplyedu", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("eduLoanDetail", "command", new EducationLoanDetail());
	}

	@RequestMapping(value="/applyeduloan", method=RequestMethod.POST)
	public long initiateEducationLoan(@ModelAttribute("eduLoanDetail") EducationLoanDetail eduLoanDetail){
		
		/*EducationLoanDetail eldtl = new EducationLoanDetail();
		eldtl.setAccNo(String.valueOf(accNo));
		eldtl.setEduLoanAmmount(Double.valueOf(loanAmount));
		eldtl.setEduLoanApplyDate(loanApplyDt);
		eldtl.setEduLoanDuration(Double.valueOf(duration));
		eldtl.setFatherAnnualIncome(Double.valueOf(annualIncome));
		eldtl.setFatherName(fatherName);
		eldtl.setCourseFee(Double.valueOf(courseFee));
		eldtl.setCourseName(courseName);
		eldtl.setFatherName(fatherName);
		eldtl.setIdCardNumber(idCardNumber);*/
		return  applyEducationLoanService.insertEducationLoanDetails(eduLoanDetail);
	}
}
