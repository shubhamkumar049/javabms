package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.service.PerformTransactionService;
import com.cognizant.vo.TransactionDetail;

@Controller
public class PerformTransactionController {
	
	@Autowired
	private PerformTransactionService transService;
	
	@RequestMapping(value = "/launchPerTrans", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("detail", "command", new TransactionDetail());
	   }

	@RequestMapping(value="/performtrans", method=RequestMethod.POST)
	public Double initiateTransaction(String accountNo, Long transactionId, 
			String customerName, String transactionType,
			String transactionAmount, String description) {
		
		
		TransactionDetail detail = new TransactionDetail();
		detail.setAccountNum(accountNo);
		detail.setAmount(Double.valueOf(transactionAmount));
		detail.setDescription(description);
		detail.setTransactionType(transactionType);
		detail.setTransactionId(transactionId);
		return transService.updateTransactionDetails(detail );
	}
	
	@RequestMapping(value="/performtransaction", method=RequestMethod.POST)
	public Double performTransaction(@ModelAttribute("detail")TransactionDetail detail ) {
		
		return transService.updateTransactionDetails(detail );
	}
}
