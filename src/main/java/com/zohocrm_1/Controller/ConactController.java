package com.zohocrm_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_1.Entities.Billing;
import com.zohocrm_1.Entities.Contact;
import com.zohocrm_1.Service.BillingService;
import com.zohocrm_1.Service.ContactService;

@Controller
public class ConactController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;

	@RequestMapping("/listContact")
	public String listOfContact(Model model) {
		List<Contact> listContact = contactService.listContact();
		model.addAttribute("Contact", listContact);
		return "ContactList";

	}

	@RequestMapping("/billing")
	public String createBills(@RequestParam("id") long id, Model model) {
		Contact ContactData = contactService.findContactById(id);
		model.addAttribute("Con", ContactData);

		return "Billing";

	}

	@RequestMapping("/savebill")
	public String saveBillData(Billing bills,Model model) {
		billingService.saveBills(bills);
		model.addAttribute("msg", "Bill Saved Thanx For Submitting!!!!!!!!!");
		List<Billing> listBills = billingService.listBills();
		model.addAttribute("bills", listBills);
		return "BillingList";

	}

	@RequestMapping("/bills")
	public String listOfbill(Model model) {
		List<Billing> listBills = billingService.listBills();
		model.addAttribute("bills", listBills);
		return "BillingList";

	}

}
