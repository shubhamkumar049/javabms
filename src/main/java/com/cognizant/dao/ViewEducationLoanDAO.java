package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.cognizant.vo.EducationLoanDetail;

public class ViewEducationLoanDAO {
	
	private SessionFactory sessionFactory;
	
	public List<EducationLoanDetail> retrieveEducationLoanDetails(long AccountNumber, long identificationCardNumber){
		List<EducationLoanDetail>  eduLists = new ArrayList<EducationLoanDetail>();
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(com.cognizant.entity.EducationLoanDetail.class);
		
		criteria.add(Restrictions.eq("ACC_NO", AccountNumber));
		criteria.add(Restrictions.eq("ID_CARD_NUMBER", identificationCardNumber));
		
		List<com.cognizant.entity.EducationLoanDetail> uniqueResult = (List<com.cognizant.entity.EducationLoanDetail>) criteria.uniqueResult();
		
		for (com.cognizant.entity.EducationLoanDetail educationLoanDetail : uniqueResult) {
			EducationLoanDetail eduLoanDetail = new EducationLoanDetail();
			eduLoanDetail.setAccNo(educationLoanDetail.getAccNo());
			eduLoanDetail.setCourseFee(educationLoanDetail.getCourseFee());
			eduLoanDetail.setCourseName(educationLoanDetail.getCourseName());
			eduLoanDetail.setEduLoanAccNo(educationLoanDetail.getEduLoanAccNo());
			eduLoanDetail.setEduLoanAmmount(educationLoanDetail.getEduLoanAmmount());
			eduLoanDetail.setEduLoanApplyDate(educationLoanDetail.getEduLoanApplyDate());
			eduLoanDetail.setEduLoanDuration(educationLoanDetail.getEduLoanDuration());
			
			eduLists.add(eduLoanDetail);
		}
	
		return eduLists;
	}
}
