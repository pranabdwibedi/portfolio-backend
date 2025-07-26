package org.pkd.portfolio.controller;

import org.pkd.portfolio.service.OwnerEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerEducationController {

	@Autowired
	OwnerEducationService ownerEducationService;
	
	@GetMapping("/educations")
	public ResponseEntity<?> fetchAllEducations(){
		return ownerEducationService.fetchAllEducation();
	}
}
