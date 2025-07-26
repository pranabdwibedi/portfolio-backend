package org.pkd.portfolio.service;

import java.util.List;

import org.pkd.portfolio.dao.PortfolioOwnerDao;
import org.pkd.portfolio.entity.PortfolioOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PortfolioOwnerService {
	@Autowired
	PortfolioOwnerDao portfolioOwnerDao;

	public ResponseEntity<?> getDetails() {
		List<PortfolioOwner> details = portfolioOwnerDao.getDetails();
		if(details.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Profile details not found");
		PortfolioOwner detail = details.getFirst();
		return ResponseEntity.status(HttpStatus.OK).body(detail);
	}
	
}
