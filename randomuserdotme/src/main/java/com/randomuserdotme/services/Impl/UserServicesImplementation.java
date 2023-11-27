package com.randomuserdotme.services.Impl;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.randomuserdotme.services.UserServices;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServicesImplementation implements UserServices {
	private static String apiUrl= "https://randomuser.me/api/";
	
	public static HashMap<?, ?> getUserData(){
		RestTemplate userRestTemplate = new RestTemplate();
			try { 
				return userRestTemplate.getForObject(apiUrl, HashMap.class); 
			}
			catch(Exception e) {
				System.out.println("No Data Found Message From Exception Handler!"); 
				return null; 
			}
	}
}
