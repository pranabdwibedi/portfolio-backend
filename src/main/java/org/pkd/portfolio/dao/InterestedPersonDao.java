package org.pkd.portfolio.dao;

import org.pkd.portfolio.entity.InterestedPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InterestedPersonDao {
	@Autowired
	InterestedPersonRepository interestedPersonRepository;

	public InterestedPerson saveInterestedPerson(InterestedPerson interestedPerson) {
		return interestedPersonRepository.save(interestedPerson);
	}
	
	

}
