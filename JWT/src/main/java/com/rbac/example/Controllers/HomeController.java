package com.rbac.example.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbac.example.Services.UserService;
import com.rbac.example.models.User;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	//API https://localhost:8004/home/users 
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("Getting Users");
		return userService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}
