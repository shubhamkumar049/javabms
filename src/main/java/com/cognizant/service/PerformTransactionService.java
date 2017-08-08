package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.dao.PerformTransactionDAO;
import com.cognizant.vo.TransactionDetail;

@Service
public class PerformTransactionService {

	
	private PerformTransactionDAO transDAO;
	
	public Double updateTransactionDetails(TransactionDetail detail){
		
		return transDAO.updateTransactionDetails(detail);
	}
}
