package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.cognizant.vo.HomeLoanDetail;


@Component
public class ViewHomeLoanDAO {
	
	private SessionFactory sessionFactory;
	
	public List<HomeLoanDetail> retrieveHomeLoanDetails(Long AccountNumber, Long  LoanId){
		
		List<HomeLoanDetail> loanDetails = new ArrayList<HomeLoanDetail>();
		HomeLoanDetail loanDetail = null;
		Session session  = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(com.cognizant.entity.HomeLoanDetail.class);
		criteria.add(Restrictions.eq("ACC_NO", AccountNumber));
		criteria.add(Restrictions.eq("LOAN_ID", LoanId));
		
		List<com.cognizant.entity.HomeLoanDetail> list = criteria.list();
		
		for (com.cognizant.entity.HomeLoanDetail homeLoanDetail : list) {
			
			if(homeLoanDetail !=null){
				loanDetail = new HomeLoanDetail();
				loanDetail.setAccNo(homeLoanDetail.getAccNo());
				loanDetail.setAnnualIncome(homeLoanDetail.getAnnualIncome());
				loanDetail.setCompanyName(homeLoanDetail.getCompanyName());
				loanDetail.setDesignation(homeLoanDetail.getDesignation());
				loanDetail.setExpCurrentCompany(homeLoanDetail.getExpCurrentCompany());
				loanDetail.setHomeLoanAccNo(homeLoanDetail.getHomeLoanAccNo());
				loanDetail.setHomeLoanId(homeLoanDetail.getHomeLoanId());
				loanDetail.setLoanAmmount(homeLoanDetail.getLoanAmmount());
				loanDetail.setLoanApplyDate(homeLoanDetail.getLoanApplyDate());
				loanDetail.setTotalExp(homeLoanDetail.getTotalExp());
				
				loanDetails.add(loanDetail);
			}
		}
		return loanDetails;
	}
}
