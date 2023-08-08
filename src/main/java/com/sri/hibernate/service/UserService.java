package com.sri.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.sri.hibernate.domain.Users;
import com.sri.hibernate.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public List<Users> findAll(){
		return userRepo.findAll();
	}
	public Users findOne(Long userId) {
		Optional<Users> userOpt = userRepo.findById(userId);
		return userOpt.orElse(new Users());
	}
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		Users newUser = userRepo.save(user);
		return newUser;
	}
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		Users updatedUser = userRepo.save(user);
		return updatedUser;
	}
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userRepo.deleteById(userId);
	}
}
