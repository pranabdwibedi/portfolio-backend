package org.pkd.portfolio.service;

import org.pkd.portfolio.dao.InterestedPersonDao;
import org.pkd.portfolio.entity.InterestedPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class InterestedPersonService {
	
	@Autowired
	InterestedPersonDao interestedPersonDao;
	
	@Autowired
	JavaMailSender javaMailSender;

	public ResponseEntity<?> saveInterestedPerson(InterestedPerson interestedPerson) {
		
		MimeMessage mm = javaMailSender.createMimeMessage();
		MimeMessageHelper mmh = new MimeMessageHelper(mm);
		try {
			mmh.setTo(interestedPerson.getEmail());
			mmh.setSubject("Contact Information of Pranab Kumar Dwibedi");
			mmh.setText("Hi "+interestedPerson.getEmail()+",\nThanks for visiting my portfolio website!\n\nAs requested, here are my contact details:\n📧 Email: pranabkumardwibedi@gmail.com\n📞 Phone: 6372266133\n📍 Location: Nagvara, Bangaluru, 560043\nFeel free to reach out for any queries, collaborations, or opportunities.\n\nBest regards,\nPranab Kumar Dwibedi");
			javaMailSender.send(mm);
			if(interestedPerson.getMessage() != null) {
				mmh.setTo("pranabkumardwibedi@gmail.com");
				mmh.setSubject("Message from "+interestedPerson.getEmail());
				mmh.setText(interestedPerson.getMessage());
				javaMailSender.send(mm);
			}
			InterestedPerson savedPerson = interestedPersonDao.saveInterestedPerson(interestedPerson);
			return ResponseEntity.status(HttpStatus.CREATED).body(savedPerson);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Couldn't send email");
		}
	}

}
