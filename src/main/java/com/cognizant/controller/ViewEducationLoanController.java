package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.service.ViewEducationLoanService;
import com.cognizant.vo.EducationLoanDetail;

@Controller
public class ViewEducationLoanController {
		
	@Autowired
	private ViewEducationLoanService viewEducationLoanService;
	
	@RequestMapping(value="/viewedudtl", method=RequestMethod.GET)
	public List<EducationLoanDetail> searchEducationLoanDetails(long AccountNumber, long identificationCardNumber){
		return viewEducationLoanService.retrieveEducationLoanDetails(AccountNumber, identificationCardNumber);
	}
		
}
