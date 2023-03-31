package com.nearMe.App.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRESTController {

	@CrossOrigin()
	@GetMapping("/List")
	public List<String> fetchffVendors() {
		List<String> ls1=new ArrayList<String>();
		ls1.add("v1");
		ls1.add("v2");
		ls1.add("v3");
		return ls1;
	}
}
