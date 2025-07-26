package org.pkd.portfolio.controller;

import org.pkd.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	@GetMapping("/projects")
	public ResponseEntity<?> findAllProjects(){
		return projectService.findAllProjects();
	}
}
