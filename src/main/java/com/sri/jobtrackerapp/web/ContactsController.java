package com.sri.jobtrackerapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sri.jobtrackerapp.domain.Contacts;
import com.sri.jobtrackerapp.service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactsController {

    @Autowired
    private ContactService contactService;
    
	@GetMapping("")
	public String getHome(ModelMap model) {
		return "Hello World";
	}

    @GetMapping("/contacts")
    public List<Contacts> getAllContacts() {
        return contactService.findAll();
    }

    @GetMapping("/contacts/{contactId}")
    public Contacts getOneContact(@PathVariable Long contactId) {
    	return contactService.findOne(contactId);
    }
    @PostMapping("/contacts/{contactId}")
    public Contacts getOneContact(@RequestBody Contacts contact) {
        return contactService.updateContact(contact);
    }

    @PostMapping("/contacts")
    public Contacts createOrUpdateContact(@RequestBody Contacts contact) {
        return contactService.updateContact(contact);
    }

    @PostMapping("/contacts/{contactId}/delete")
    public void deleteOneContact(@PathVariable Long contactId) {
        contactService.deleteContact(contactId);
    }
}
