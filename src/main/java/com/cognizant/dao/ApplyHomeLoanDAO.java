package com.cognizant.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.vo.HomeLoanDetail;

@Component
@Transactional
public class ApplyHomeLoanDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public long insertHomeLoanDetails(HomeLoanDetail hmdtl){
		
		Session session = sessionFactory.getCurrentSession();
		com.cognizant.entity.HomeLoanDetail homeLoanDetail = new com.cognizant.entity.HomeLoanDetail();
		homeLoanDetail.setAccNo(hmdtl.getAccNo());
		homeLoanDetail.setAnnualIncome(hmdtl.getAnnualIncome());
		homeLoanDetail.setCompanyName(hmdtl.getCompanyName());
		homeLoanDetail.setDesignation(hmdtl.getDesignation());
		homeLoanDetail.setExpCurrentCompany(hmdtl.getExpCurrentCompany());
		homeLoanDetail.setHomeLoanAccNo(hmdtl.getHomeLoanAccNo());
		homeLoanDetail.setHomeLoanId(hmdtl.getHomeLoanId());
		homeLoanDetail.setLoanAmmount(hmdtl.getLoanAmmount());
		homeLoanDetail.setLoanApplyDate(hmdtl.getLoanApplyDate());
		homeLoanDetail.setTotalExp(hmdtl.getTotalExp());
		
		session.beginTransaction();
		
		Serializable homeLoanDetailId = session.save(homeLoanDetail);
		
		return (Long)homeLoanDetailId;
	}
}
