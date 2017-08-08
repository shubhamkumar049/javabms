package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.service.ViewHomeLoanService;
import com.cognizant.vo.HomeLoanDetail;

@Controller
public class ViewHomeLoanController {
	
	@Autowired
	private ViewHomeLoanService homeLoanService; 
	
	@RequestMapping(value="/viewhomeloan", method=RequestMethod.POST)
	public List<HomeLoanDetail> searchHomeLoanDetails(Long AccountNumber, Long  LoanId){
		
		return homeLoanService.retrieveHomeLoanDetails(AccountNumber, LoanId);
	}
	
	
}
