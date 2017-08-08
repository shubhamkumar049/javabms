package com.cognizant.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.vo.TransactionDetail;

@Component
@Transactional
public class PerformTransactionDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Double updateTransactionDetails(TransactionDetail details){
		
		Session session = sessionFactory.openSession();
		
		com.cognizant.entity.TransactionDetail tranDetail = new com.cognizant.entity.TransactionDetail();
		
		tranDetail.setAccountNum(details.getAccountNum());
		tranDetail.setAmount(details.getAmount());
		tranDetail.setBalance(details.getBalance());
		tranDetail.setDescription(details.getDescription());
		tranDetail.setMessage(details.getMessage());
		tranDetail.setTransactionId(details.getTransactionId());
		tranDetail.setTransactionType(details.getTransactionType());
		
		session.beginTransaction();
		
		Double detailId= (Double) session.save(tranDetail);
		
		return detailId;
	}
	
}
