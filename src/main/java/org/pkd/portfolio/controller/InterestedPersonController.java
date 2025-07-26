package org.pkd.portfolio.controller;

import org.pkd.portfolio.entity.InterestedPerson;
import org.pkd.portfolio.service.InterestedPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestedPersonController {
	@Autowired
	InterestedPersonService interestedPersonService;
	@PostMapping("/interestedPerson")
	public ResponseEntity<?> saveInterestedPerson(@RequestBody InterestedPerson interestedPerson){
		return interestedPersonService.saveInterestedPerson(interestedPerson);
	}
}
