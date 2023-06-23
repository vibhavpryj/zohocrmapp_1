package com.zohocrm_1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm_1.Entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
