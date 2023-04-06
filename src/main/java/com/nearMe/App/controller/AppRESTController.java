package com.nearMe.App.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nearMe.App.entities.LocationInfo;
import com.nearMe.App.service.AppService;

@RestController
public class AppRESTController {
	
	@Autowired
	private AppService apps;
	
	private static final Logger logger=LoggerFactory.getLogger(AppRESTController.class);

	@CrossOrigin()
	@GetMapping("/List")
	public List<String> fetchffVendors() {
		List<String> ls1=new ArrayList<String>();
		ls1.add("v1");
		ls1.add("v2");
		ls1.add("v3");
		return ls1;
	}
	
	@GetMapping("/message")
	public String message() {
		return apps.getMessage();
	}
	
	@GetMapping("/List/{id}")
	public LocationInfo loca_inf(@PathVariable String id) {
		logger.error("Controller Class : Request received for Location : "+id);
		return apps.getLocationInfo(id);
		
	}
	
}
