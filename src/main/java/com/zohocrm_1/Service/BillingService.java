package com.zohocrm_1.Service;

import java.util.List;

import com.zohocrm_1.Entities.Billing;

public interface BillingService {

	void saveBills(Billing bills);

	List<Billing> listBills();
	
	

		
	

}
