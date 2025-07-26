package org.pkd.portfolio.service;

import java.util.List;

import org.pkd.portfolio.dao.OwnerEducationDao;
import org.pkd.portfolio.entity.OwnerEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OwnerEducationService {
	@Autowired
	OwnerEducationDao ownerEducationDao;

	public ResponseEntity<?> fetchAllEducation() {
		List<OwnerEducation> educationList = ownerEducationDao.fetchAllEducation();
		if(educationList.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No educational details found");
		return ResponseEntity.status(HttpStatus.OK).body(educationList);
	}
	
}
