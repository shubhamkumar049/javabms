package com.cognizant.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.service.ApplyHomeLoanService;
import com.cognizant.vo.HomeLoanDetail;

@Controller
public class ApplyHomeLoanController {
	
	@Autowired
	private ApplyHomeLoanService applyHomeLoanService;
	
	private DateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
	
	@RequestMapping(value="",method= RequestMethod.POST)
	public long initiateHomeLoan(long AccountNumber, long loanAmount, 
			Date loanApplyDate, int loanDuration, long annualIncome, String companyName,
			String designation, int totalExperience, int currentExperience, Double expCurrentCompany, String homeLoanAccNo, long homeLoanId, Double loanAmmount, Double totalExp){
		HomeLoanDetail hmdtl = new HomeLoanDetail();
		hmdtl.setAccNo(AccountNumber);
		hmdtl.setAnnualIncome(annualIncome);
		hmdtl.setCompanyName(companyName);
		hmdtl.setDesignation(designation);
		hmdtl.setExpCurrentCompany(expCurrentCompany);
		hmdtl.setHomeLoanAccNo(homeLoanAccNo);
		hmdtl.setHomeLoanId(dateFormat.format(loanApplyDate)+String.valueOf(AccountNumber));
		hmdtl.setLoanAmmount(loanAmmount);
		hmdtl.setLoanApplyDate(loanApplyDate);
		hmdtl.setTotalExp(totalExp);
		
		return applyHomeLoanService.insertHomeLoanDetails(hmdtl);
	}
}
