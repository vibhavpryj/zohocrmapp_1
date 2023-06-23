package com.zohocrm_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_1.Entities.Billing;
import com.zohocrm_1.Repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void saveBills(Billing bills) {
		billingRepo.save(bills);
	}

	@Override
	public List<Billing> listBills() {
		List<Billing> findAll = billingRepo.findAll();
		return findAll;
	}
	
}
