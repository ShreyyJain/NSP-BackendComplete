package com.lti.springboot.dao;

import com.lti.springboot.pojo.studentreg;

public interface StudentRecordDAO {

	
	studentreg findStudent(String aadharNumber);
}
