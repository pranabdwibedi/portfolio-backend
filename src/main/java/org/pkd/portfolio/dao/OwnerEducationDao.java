package org.pkd.portfolio.dao;

import java.util.List;

import org.pkd.portfolio.entity.OwnerEducation;
import org.pkd.portfolio.repository.OwnerEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerEducationDao {
	@Autowired
	OwnerEducationRepository ownerEducationRepository;

	public List<OwnerEducation> fetchAllEducation() {
		return ownerEducationRepository.findAll();		
	}

}
