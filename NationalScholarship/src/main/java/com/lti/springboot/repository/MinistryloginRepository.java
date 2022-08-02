package com.lti.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.springboot.pojo.Ministry;


public interface MinistryloginRepository  extends JpaRepository<Ministry , Long> {

	Ministry findByUsername(String username);
}
