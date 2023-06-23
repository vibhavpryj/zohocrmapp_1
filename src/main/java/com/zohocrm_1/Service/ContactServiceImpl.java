package com.zohocrm_1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_1.Entities.Contact;
import com.zohocrm_1.Repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> listContact() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact> ContactId = contactRepo.findById(id);
		Contact contact = ContactId.get();
		return contact;
	}
}
