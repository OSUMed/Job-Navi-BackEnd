package com.sri.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.hibernate.domain.Applications;

public interface UserRepository extends JpaRepository<Applications, Long>{

}
