package org.pkd.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String title;
	private String description;
	private String logoUrl;
	@Column(unique = true, nullable = false)
	private String repoUrl;
	@Column(unique = true)
	private String websiteUrl;
}
