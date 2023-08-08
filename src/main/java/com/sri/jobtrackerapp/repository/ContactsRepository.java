package com.sri.jobtrackerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.jobtrackerapp.domain.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long>{

}
