package org.pkd.portfolio.repository;

import org.pkd.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
