package com.sri.jobtrackerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@CrossOrigin(
	    origins = {"http://localhost:3000", "https://cors-anywhere-osu.up.railway.app", "https://jobtrackerfe.netlify.app/", "https://jobtrackerfe.netlify.app/", "https://jobtrackerbackend.up.railway.app"},
	    allowedHeaders = {"Authorization", "Content-Type"}, // Add the headers you want to allow
	    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE} // Add the HTTP methods you want to allow
	)
public class HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

}
