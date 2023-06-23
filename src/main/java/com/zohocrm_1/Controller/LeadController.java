package com.zohocrm_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_1.Entities.Contact;
import com.zohocrm_1.Entities.Lead;
import com.zohocrm_1.Service.ContactService;
import com.zohocrm_1.Service.leadService;

@Controller
public class LeadController {
	@Autowired
	private leadService leadService;
	@Autowired
	private ContactService contactService;
//	http://localhost:8080/createlead
	@RequestMapping("/createlead")
	public String createLead() {
		return "create";
		
	}
	@RequestMapping("/saveleads")
	public String savelead(@ModelAttribute("lead") Lead lead,Model model) {
		model.addAttribute("lead", lead);
		leadService.saveLead(lead);
		return "lead_info";
		
	}
	@RequestMapping("/listLead")
	public String listLeads(Model model) {
		List<Lead> listAllLead = leadService.listAllLead();
		model.addAttribute("list", listAllLead);
		return "ListLead";
		
	}
	@RequestMapping("/leadInfo")
	public String leadinfo(@RequestParam("id") long id,Model model) {
	Lead findById = leadService.getLeadById(id);
		model.addAttribute("lead", findById);
		return "lead_info";
	}
	@RequestMapping("/convert")
	public String ConvertById(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContact(contact);
		leadService.deleteById(id);
		List<Contact> listContact = contactService.listContact();
		model.addAttribute("Contact", listContact);
		return "ContactList";
		
	}
}
