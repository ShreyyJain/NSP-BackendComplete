package com.lti.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.springboot.pojo.ScholarshipApplication;
import com.lti.springboot.pojo.studentreg;
import com.lti.springboot.repository.ScholarshipApplicationRepository;

@RestController
@CrossOrigin
public class ScholarshipController {

	
	@Autowired
	private ScholarshipApplicationRepository scholarApp;
	
	

	//apply for scholarship
	@PostMapping("/applystudent")
	public String studentApply(@RequestBody ScholarshipApplication app)
	{
		scholarApp.save(app);
		return "Application is submitted successfully";
		
	}
	
	//get scholarship details
	@GetMapping("/scholarApplications")
	public List<ScholarshipApplication> getAllApplications()
	{
		return scholarApp.findAll();
	}
	
//	List<ScholarshipApplication> findByFinalStatus(String finalStatus)
//	{
//		studentreg reg = new studentreg();
//		scholarApp.findByFinalStatus(reg.setApplicationstatus(finalStatus));
//	}
	@GetMapping("/status/{aadhar}")
	public String findByStudentAadhar(@PathVariable String aadhar)
	{
		System.out.println("Reaching");
		Optional<ScholarshipApplication> sca = scholarApp.findByAadhar(aadhar);
		ScholarshipApplication application = sca.get(); 
		
		System.out.println(aadhar);
		return application.getFinalStatus();
//		List<ScholarshipApplication> schoApp = scholarApp.findAll();
//		for(ScholarshipApplication sa : schoApp)
//		{
//			if(sa.getAadhar() == aadhar)
//			{
//				str = sa.getFinalStatus();
//				return str;
//			}			
//		}
//		return null;
		
	}
	
}
