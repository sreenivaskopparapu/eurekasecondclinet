package com.example.eurekaclienttwo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceTwo")
public class ServiceTwo {

	@GetMapping("/getMobileNumber/{mobile}")
	public String serviceTwo(@PathVariable("mobile") String mobileNumber) {
		
		return "response from service two mobile no is:"+mobileNumber;
	}
	@GetMapping("/getCityName")
	public String getCityname(@RequestParam("city") String cityName) {
		
		return "response from service two city is:"+cityName;
	}
}
