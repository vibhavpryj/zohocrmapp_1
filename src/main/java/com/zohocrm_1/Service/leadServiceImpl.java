package com.zohocrm_1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_1.Entities.Lead;
import com.zohocrm_1.Repositories.LeadRepository;
@Service
public class leadServiceImpl implements leadService {
	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> listAllLead() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}
	
	
	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

}
