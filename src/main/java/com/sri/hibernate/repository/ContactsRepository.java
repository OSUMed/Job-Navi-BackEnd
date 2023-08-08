package com.sri.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.hibernate.domain.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long>{

}
