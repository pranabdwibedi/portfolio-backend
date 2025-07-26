package org.pkd.portfolio.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class OwnerEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private PortfolioOwner owner;
	private String courseName;
	private String instituteName;
	private double mark;
	private String certificateLink;
	@Lob
	private String about;
	private int startYear;
	private int endYear;
}
