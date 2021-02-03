package com.example.MongoBasicProject;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	public @ResponseBody User createUser(@Valid
			@RequestBody User bindingResult, ModelMap model ){
		try {
	
			User userr = userService.saveUser(bindingResult);
			return userr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
