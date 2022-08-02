package com.lti.springboot.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.springboot.pojo.InstituteDetail;

import java.util.*;


public interface InstituteDetailsRepository extends JpaRepository<InstituteDetail, Long> {

	Optional<InstituteDetail> findByInstiCode(String instiCode);
	InstituteDetail findByEmailid(String emailid);
	List<InstituteDetail> findByApplicationStatus(String applicationStatus);
	
	
}
