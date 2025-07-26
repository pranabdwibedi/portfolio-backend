package org.pkd.portfolio.controller;

import org.pkd.portfolio.service.PortfolioOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioOwnerController {
	@Autowired
	PortfolioOwnerService portfolioOwnerService;
	
	@CrossOrigin(origins = "http://localhost:5500")
	@GetMapping("/details")
	public ResponseEntity<?> getDetails(){
		return portfolioOwnerService.getDetails();
	}
}