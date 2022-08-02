package com.lti.springboot.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.springboot.dao.*;
import com.lti.springboot.pojo.*;
import com.lti.springboot.repository.StudentLoginRepository;
import com.lti.springboot.repository.StudentRepository;

@Service("studentrecordservice")
public class StudentRecordServiceImpl implements StudentRecordService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public studentreg addStudent(studentreg student) {
		System.out.println("Inside Service Layer");
	      return studentRepo.save(student);
	}
	
	
	@Autowired
	StudentRecordDAO dao;
	
	@Override
	public studentreg findStudent(String aadharNumber) {
		return dao.findStudent(aadharNumber);
	}
	
	@Autowired
	StudentLoginRepository studlogin;
	public studentlogin credsUsed(studentlogin sl) {
		System.out.println("login service layer");
		return studlogin.save(sl);
	}
	
}
