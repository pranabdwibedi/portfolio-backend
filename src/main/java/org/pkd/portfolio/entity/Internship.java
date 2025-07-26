package org.pkd.portfolio.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Internship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String companyName;
	private String logoUrl;
	@Lob
	private String aboutCompany;
	@Lob
	private String experience;
	private String certificateUrl;
	private String projectReportUrl;
	@OneToMany(mappedBy = "internship")
	@JsonManagedReference
	private List<InternshipPhotoGallery> internshipPhotoGallery;
}
