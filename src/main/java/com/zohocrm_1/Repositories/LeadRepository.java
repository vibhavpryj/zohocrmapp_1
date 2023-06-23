package com.zohocrm_1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm_1.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
