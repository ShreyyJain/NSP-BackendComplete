package com.lti.springboot.service;
import com.lti.springboot.pojo.*;
import java.util.*;

public interface StudentRecordService {

	public studentreg addStudent(studentreg student);
	
	public studentreg findStudent(String aadharNumber);
	
	public studentlogin credsUsed(studentlogin sl);
	
}
