package org.pkd.portfolio.service;

import java.util.List;

import org.pkd.portfolio.dao.InternshipDao;
import org.pkd.portfolio.entity.Internship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InternshipService {
	@Autowired
	InternshipDao internshipDao;

	public ResponseEntity<?> getAllInternships() {
		List<Internship> internships = internshipDao.getAllinternships();
		if(internships.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No data found");
		return ResponseEntity.status(HttpStatus.OK).body(internships);
	}
}
