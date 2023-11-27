package com.randomuserdotme.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.randomuserdotme.services.Impl.UserServicesImplementation;

@RestController
public class UserController {
	@GetMapping("/users")
	public static HashMap<?, ?> getUserDetailsFromExternalAPI() {
		getGender();
		
		return UserServicesImplementation.getUserData();
	}
	public static void getGender() {
		System.out.println("Complete HashMap Values are : "+UserServicesImplementation.getUserData().get("results"));
		JSONObject userJSONObj = new JSONObject(UserServicesImplementation.getUserData());
		List<String> list = new ArrayList<String>();
		JSONArray jsonArr = userJSONObj.getJSONArray("results");
		for(int i =0; i<jsonArr.length(); i++) {
			list.add(jsonArr.getJSONObject(i).getString("gender"));
			System.out.println("Gender is : "+jsonArr.getJSONObject(i).getString("gender"));
		}
	}
}
