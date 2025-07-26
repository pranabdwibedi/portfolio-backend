package org.pkd.portfolio.dao;

import java.util.List;

import org.pkd.portfolio.entity.Skill;
import org.pkd.portfolio.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SkillDao {
	@Autowired
	SkillRepository skillRepository;
	
	public List<Skill> findAllSkills(){
		return skillRepository.findAll();
	}
}
