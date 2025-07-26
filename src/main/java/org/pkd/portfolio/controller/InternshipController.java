package org.pkd.portfolio.controller;

import org.pkd.portfolio.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternshipController {
	@Autowired
	InternshipService internshipService;
	
	@GetMapping("/internships")
	public ResponseEntity<?> getAllInternships(){
		return internshipService.getAllInternships();
	}
}
