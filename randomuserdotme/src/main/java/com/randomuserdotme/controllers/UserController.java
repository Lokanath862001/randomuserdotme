package com.randomuserdotme.controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randomuserdotme.services.Impl.UserServicesImplementation;

@RestController
public class UserController {
	@GetMapping("/users")
	public static HashMap<?, ?> getUserDetailsFromExternalAPI() {
		return UserServicesImplementation.getUserData();
	}
}
