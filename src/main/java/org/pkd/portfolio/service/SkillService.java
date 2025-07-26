package org.pkd.portfolio.service;

import java.util.List;

import org.pkd.portfolio.dao.SkillDao;
import org.pkd.portfolio.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
	@Autowired
	SkillDao skillDao;
	public ResponseEntity<?> findAllSkills(){
		List<Skill> allSkills = skillDao.findAllSkills();
		if(allSkills.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found any skills");
		return ResponseEntity.status(HttpStatus.OK).body(allSkills);
	}
}
