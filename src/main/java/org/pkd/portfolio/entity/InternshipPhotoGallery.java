package org.pkd.portfolio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class InternshipPhotoGallery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imageUrl;
	@Lob
	private String aboutImage;
	@ManyToOne
	@JoinColumn(name = "internship_id")
	@JsonBackReference
	private Internship internship;
}
