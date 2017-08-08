package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ViewHomeLoanDAO;
import com.cognizant.vo.HomeLoanDetail;

@Service
public class ViewHomeLoanService {
	
	@Autowired
	private ViewHomeLoanDAO homeLoanDAO;
	
	public List<HomeLoanDetail> retrieveHomeLoanDetails(Long AccountNumber, Long  LoanId){
		return homeLoanDAO.retrieveHomeLoanDetails(AccountNumber, LoanId);
	}
}
