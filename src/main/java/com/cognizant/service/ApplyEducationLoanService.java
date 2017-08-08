package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.dao.ApplyEducationLoanDAO;
import com.cognizant.vo.EducationLoanDetail;

@Service
public class ApplyEducationLoanService {
	
	private ApplyEducationLoanDAO applyEducationLoanDAO;
	
	public long insertEducationLoanDetails(EducationLoanDetail eldtl){
		return applyEducationLoanDAO.insertEducationLoanDetails(eldtl);
	}
}
