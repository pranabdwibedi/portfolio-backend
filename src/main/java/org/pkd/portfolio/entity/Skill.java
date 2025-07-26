package org.pkd.portfolio.entity;

import org.pkd.portfolio.util.SkillType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Enumerated(EnumType.STRING)
	private SkillType type;
	private String imageUrl;
	@Lob
	private String about;
	@ManyToOne
	private PortfolioOwner owner;
}
