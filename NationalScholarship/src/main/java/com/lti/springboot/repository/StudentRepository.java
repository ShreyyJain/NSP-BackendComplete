package com.lti.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lti.springboot.pojo.studentreg;

public interface StudentRepository extends JpaRepository<studentreg , Long> {

	studentreg findByAadharNumber(String aadharNumber);
	
	
}
