package com.sri.hibernate.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sri.hibernate.domain.Users;
import com.sri.hibernate.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/accounts")
	public String getAllUsers(ModelMap model) {
		// Get all the users with findAll() which is from Service that does findAll() in
		// JpaRepository interface:
		List<Users> allUsers = userService.findAll();
		model.put("users", allUsers);

		// Results of findAll():
		return "users";
	}

//	@GetMapping("")
//	public String getHome(ModelMap model) {
//		return "users";
//	}

	@GetMapping("/accounts/{userId}")
	public String getOneUser(ModelMap model, @PathVariable Long userId) {
		Users user = userService.findOne(userId);
		System.out.println(user);
		model.put("users", Arrays.asList(user));
		model.put("user", user);
		return "users";
	}

	@PostMapping("/accounts/{userId}")
	public String updateOneUser(ModelMap model, @PathVariable Long userId, Users user) {
		userService.updateUser(user);
		return "redirect:/accounts/" + user.getUserId();
	}

	@PostMapping("/register")
	public String getPostUser(Users user) {
		Users newUser = userService.createUser(user);
		Users newRegisteredUser = userService.createUser(newUser);
		return "redirect:/register";
	}

	@GetMapping("/register")
	public String getOneUser(ModelMap model) {
		Users newUser = new Users();
		model.put("user", newUser);
		return "register";
	}

	@PostMapping("/accounts/{userId}/delete")
	public String deleteOneUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
		return "redirect:/accounts";
	}
}
