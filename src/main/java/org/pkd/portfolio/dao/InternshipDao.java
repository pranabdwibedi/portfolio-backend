package org.pkd.portfolio.dao;

import java.util.List;

import org.pkd.portfolio.entity.Internship;
import org.pkd.portfolio.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InternshipDao {
	@Autowired
	InternshipRepository internshipRepository;

	public List<Internship> getAllinternships() {
		return internshipRepository.findAll();
	}
}
