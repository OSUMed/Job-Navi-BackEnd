package com.sri.jobtrackerapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sri.jobtrackerapp.domain.Applications;
import com.sri.jobtrackerapp.domain.Contacts;
import com.sri.jobtrackerapp.service.ApplicationsService;

@RestController
@RequestMapping("/api")
public class ApplicationsController {

    @Autowired
    private ApplicationsService applicationsService;

    @GetMapping("/applications")
    public List<Applications> getAllApplications() {
        return applicationsService.findAll();
    }

    @GetMapping("/applications/{applicationId}")
    public Applications getOneApplication(@PathVariable Long applicationId) {
        return applicationsService.findOne(applicationId);
    }
    @PostMapping("/applications/{applicationId}")
    public Applications updOneApplication(@RequestBody Applications application) {
        return applicationsService.updateApplication(application);
    }

    @PostMapping("/applications")
    public Applications createOrUpdateApplication(@RequestBody Applications application) {
        return applicationsService.updateApplication(application);
    }

    @PostMapping("/applications/{applicationId}/delete")
    public void deleteOneApplication(@PathVariable Long applicationId) {
        applicationsService.deleteApplication(applicationId);
    }
}
