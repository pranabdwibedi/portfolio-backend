package org.pkd.portfolio.repository;

import org.pkd.portfolio.entity.PortfolioOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioOwnerRepository extends JpaRepository<PortfolioOwner, Integer> {
	
}
