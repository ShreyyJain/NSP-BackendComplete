package com.lti.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.springboot.pojo.Ministry;

import com.lti.springboot.repository.MinistryloginRepository;

@Service("ministryloginservice")
public class MinistryloginServiceImpl implements  MinistryloginService
{
	
	@Autowired
	private MinistryloginRepository ministry;
	
	
	@Override
	public Ministry addMinistry(Ministry ministry1)
	{
		return ministry.save(ministry1);
	}

}
