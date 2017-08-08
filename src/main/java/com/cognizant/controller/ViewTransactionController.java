package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.service.ViewTransactionService;
import com.cognizant.vo.TransactionDetail;

@Controller
public class ViewTransactionController {
	
	@Autowired
	private ViewTransactionService viewTransService;
	
	@RequestMapping(value="/viewtransaction", method=RequestMethod.GET)
	public List<TransactionDetail> searchUserTransaction (String AccountNumber, Long  TransactionId) {
		
		TransactionDetail trandetail=new TransactionDetail();
		trandetail.setAccountNum(AccountNumber);
		trandetail.setTransactionId(TransactionId);
		
		return viewTransService.retrieveTransactionDetails(AccountNumber, TransactionId);
	}
}
