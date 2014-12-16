package com.picsauditing.lms.controller;

import com.picsauditing.lms.common.model.User;
import com.picsauditing.lms.messaging.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/users")
public class UserController {

	@Autowired
	private Publisher publisher;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@ModelAttribute User user) {
		publisher.publish(user);
	}

	public void updateUser() {

	}

	public void deleteUser() {

	}
}
