package org.pkd.portfolio.controller;

import org.pkd.portfolio.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
	@Autowired
	SkillService skillService;
	
	@GetMapping("/skills")
	public ResponseEntity<?> findAllSkills(){
		return skillService.findAllSkills();
	}
}
