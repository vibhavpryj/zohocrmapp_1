package com.zohocrm_1.Service;

import java.util.List;

import com.zohocrm_1.Entities.Lead;

public interface leadService {

	public void saveLead(Lead lead);

	public List<Lead> listAllLead();

	public Lead getLeadById(long id);

	public void deleteById(long id);


}
