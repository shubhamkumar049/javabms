package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ViewTransactionDAO;
import com.cognizant.vo.TransactionDetail;


@Service
public class ViewTransactionService {
	
	@Autowired
	private ViewTransactionDAO viewTransDao;
	
	public List<TransactionDetail> retrieveTransactionDetails(String AccountNumber, Long  TransactionId)
	{
		return viewTransDao.retrieveTransactionDetails(AccountNumber, TransactionId);
		
	}

}
