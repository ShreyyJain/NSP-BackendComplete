package com.lti.springboot.service;

import com.lti.springboot.pojo.*;
import java.util.List;



public interface InstituteDetailsService {


	public InstituteDetail addInstitute(InstituteDetail addObj);	
	
	public List< InstituteDetail> getAllInstituteDetail ();
	
	
}

/*
public void deleteAddress(int instituteCode);
public void updateAddress(InstituteDetail updateObj);
public InstituteDetail getInstituteDetail(String instituteCode);

*/