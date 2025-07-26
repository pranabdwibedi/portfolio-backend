package org.pkd.portfolio.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class  InterestedPerson {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String message;
	private String email;
	@CreationTimestamp
	private LocalDate date;
	@CreationTimestamp
	private LocalTime time;
}
