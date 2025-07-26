package org.pkd.portfolio.dao;

import java.util.List;

import org.pkd.portfolio.entity.PortfolioOwner;
import org.pkd.portfolio.repository.PortfolioOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PortfolioOwnerDao {
	
	@Autowired
	PortfolioOwnerRepository portfolioOwnerRepository;

	public List<PortfolioOwner> getDetails() {
		return portfolioOwnerRepository.findAll();
	}
	
	
}
