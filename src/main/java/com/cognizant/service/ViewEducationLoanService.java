package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ViewEducationLoanDAO;
import com.cognizant.vo.EducationLoanDetail;

@Service
public class ViewEducationLoanService {
	
	@Autowired
	private ViewEducationLoanDAO viewEducationLoanDAO;
	
	public List<EducationLoanDetail> retrieveEducationLoanDetails(Long AccountNumber, Long identificationCardNumber){
		
		return viewEducationLoanDAO.retrieveEducationLoanDetails(AccountNumber, identificationCardNumber);
	}
}
