package org.pkd.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class PortfolioOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String photoUrl;
	@Lob
	private String bio;
	private String email;
	private String linkedinUrl;
	private String githubUrl;
	private String resumeLink;
}
