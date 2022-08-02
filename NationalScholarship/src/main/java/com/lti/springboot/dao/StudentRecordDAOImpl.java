package com.lti.springboot.dao;

import org.springframework.stereotype.Repository;

import com.lti.springboot.pojo.*;

import javax.persistence.*;
import javax.transaction.Transactional;

@Repository
public class StudentRecordDAOImpl implements StudentRecordDAO {

	@PersistenceContext 
	private EntityManager em;
	
	@Override
	@Transactional
	public studentreg findStudent(String aadharNumber) {
		System.out.println("Inside Student Record DAO");
		return em.find(studentreg.class , aadharNumber);
	
	}
}




