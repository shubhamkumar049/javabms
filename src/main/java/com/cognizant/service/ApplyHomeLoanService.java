package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ApplyHomeLoanDAO;
import com.cognizant.vo.HomeLoanDetail;

@Service
public class ApplyHomeLoanService {

	@Autowired
	private ApplyHomeLoanDAO applyHomeLoanDAO;
	
	public long insertHomeLoanDetails(HomeLoanDetail hmdtl){
		return applyHomeLoanDAO.insertHomeLoanDetails(hmdtl);
	}
	
}
