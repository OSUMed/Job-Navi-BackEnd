package com.sri.jobtrackerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.jobtrackerapp.domain.Applications;

public interface ApplicationsRepository extends JpaRepository<Applications, Long>{

}
