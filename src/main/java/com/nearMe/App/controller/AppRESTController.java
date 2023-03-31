package com.nearMe.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRESTController {

	@GetMapping("/List")
	public String fetchffVendors() {
		return "Vendor";
	}
}
