package com.cognizant.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.vo.EducationLoanDetail;

@Component
@Transactional
public class ApplyEducationLoanDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public long insertEducationLoanDetails(EducationLoanDetail eldtl){
		
		Session session = sessionFactory.getCurrentSession();
		com.cognizant.entity.EducationLoanDetail eduLoanDetail = new com.cognizant.entity.EducationLoanDetail();
		eduLoanDetail.setAccNo(eldtl.getAccNo());
		eduLoanDetail.setCourseFee(eldtl.getCourseFee());
		eduLoanDetail.setEduLoanAccNo(eldtl.getEduLoanAccNo());
		eduLoanDetail.setEduLoanAmmount(eldtl.getEduLoanAmmount());
		eduLoanDetail.setEduLoanApplyDate(eldtl.getEduLoanApplyDate());
		eduLoanDetail.setEduLoanDuration(eldtl.getEduLoanDuration());
		eduLoanDetail.setFatherAnnualIncome(eldtl.getFatherAnnualIncome());
		eduLoanDetail.setFatherName(eldtl.getFatherName());
		eduLoanDetail.setIdCardNumber(eldtl.getIdCardNumber());
		session.beginTransaction();
		Serializable eduLoanDetailId = session.save(eduLoanDetail);
		return (Long)eduLoanDetailId;
	}
}
