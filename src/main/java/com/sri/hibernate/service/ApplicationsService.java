package com.sri.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.hibernate.domain.Applications;
import com.sri.hibernate.repository.ApplicationsRepository;

@Service
public class ApplicationsService {
    @Autowired
    private ApplicationsRepository applicationRepo;

    public List<Applications> findAll() {
        return applicationRepo.findAll();
    }

    public Applications findOne(Long applicationId) {
        Optional<Applications> applicationOpt = applicationRepo.findById(applicationId);
        return applicationOpt.orElse(new Applications());
    }

    public Applications updateApplication(Applications application) {
        Applications newApplication = applicationRepo.save(application);
        return newApplication;
    }

    public void deleteApplication(Long applicationId) {
        applicationRepo.deleteById(applicationId);
    }
}
