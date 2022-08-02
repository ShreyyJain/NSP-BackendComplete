package com.lti.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lti.springboot.pojo.*;

public interface StudentLoginRepository extends JpaRepository<studentlogin, Long>{

}
