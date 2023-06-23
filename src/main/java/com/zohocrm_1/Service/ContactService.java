package com.zohocrm_1.Service;

import java.util.List;

import com.zohocrm_1.Entities.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> listContact();

	Contact findContactById(long id);

}
