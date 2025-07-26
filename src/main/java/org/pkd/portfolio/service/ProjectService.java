package org.pkd.portfolio.service;

import java.util.List;

import org.pkd.portfolio.dao.ProjectDao;
import org.pkd.portfolio.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	@Autowired
	ProjectDao projectDao;

	public ResponseEntity<?> findAllProjects() {
		List<Project> projects = projectDao.findAllProjects();
		if(projects.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No project Found");
		return ResponseEntity.status(HttpStatus.OK).body(projects);
	}
}
