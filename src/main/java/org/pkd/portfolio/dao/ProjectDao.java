package org.pkd.portfolio.dao;

import java.util.List;

import org.pkd.portfolio.entity.Project;
import org.pkd.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDao {
	@Autowired
	ProjectRepository projectRepository;

	public List<Project> findAllProjects() {
		return projectRepository.findAll();
	}
}
