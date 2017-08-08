package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.vo.TransactionDetail;

@Component
@Transactional
public class ViewTransactionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<TransactionDetail> retrieveTransactionDetails(String AccountNumber, Long  TransactionId)	{
		
		List<TransactionDetail> detailList = new ArrayList<TransactionDetail>();
		
		TransactionDetail detail = null;
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(com.cognizant.entity.TransactionDetail.class);
		criteria.add(Restrictions.eq("ACC_NO", AccountNumber));
		criteria.add(Restrictions.eq("TRANSACTION_ID", TransactionId));
		
		List<com.cognizant.entity.TransactionDetail> lists = criteria.list();
		
		for (com.cognizant.entity.TransactionDetail transactionDetail : lists) {
			
			if(transactionDetail != null) {
				detail = new TransactionDetail();
				detail.setAccountNum(transactionDetail.getAccountNum());
				detail.setAmount(transactionDetail.getAmount());
				detail.setBalance(transactionDetail.getBalance());
				detail.setDescription(transactionDetail.getDescription());
				detail.setTransactionId(transactionDetail.getTransactionId());
				detail.setTransactionType(transactionDetail.getTransactionType());
				
				detailList.add(detail);
			}
		}
		return detailList;
	}
}
