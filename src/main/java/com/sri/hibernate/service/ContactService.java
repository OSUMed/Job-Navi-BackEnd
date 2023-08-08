package com.sri.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.sri.hibernate.domain.Contacts;
import com.sri.hibernate.domain.Users;
import com.sri.hibernate.repository.ContactsRepository;

@Service
public class ContactService {
    @Autowired
    private ContactsRepository contactsRepo;

    public List<Contacts> findAll() {
        return contactsRepo.findAll();
    }

    public Contacts findOne(Long contactId) {
        Optional<Contacts> contactOpt = contactsRepo.findById(contactId);
        return contactOpt.orElse(new Contacts());
    }

    public Contacts createContact(Contacts contact) {
    	Contacts newContact = contactsRepo.save(contact);
        return newContact;
    }

    public Contacts updateContact(Contacts contact) {
        Contacts updatedContact = contactsRepo.save(contact);
        return updatedContact;
    }

    public void deleteContact(Long contactId) {
    	contactsRepo.deleteById(contactId);
    }
}
