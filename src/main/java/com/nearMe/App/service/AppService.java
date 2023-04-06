package com.nearMe.App.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearMe.App.entities.LocationInfo;
import com.nearMe.App.repo.AppRepository;

@Service
public class AppService {
	
	@Autowired
	private AppRepository appRepository;
	
	private static final Logger logger=LoggerFactory.getLogger(AppService.class);
	

	public String getMessage() {
		return "success";
	}
	
	public LocationInfo getLocationInfo(String str) {
		//Optional<LocationInfo> li=appRepository.findById(str);
		LocationInfo li=null;
		logger.error("Service Class : Fetching data from Database.");
		try {
			li=appRepository.findByLocation(str);
		}catch(Exception e) {
			logger.error("Service Class : Error while fetching data from Database");
		}
		
		return  li;
	}
}
