package com.picsauditing.lms.controller;

import com.picsauditing.lms.common.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/learningResources")
public class LearningResources {

	@RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
	public void createUser(@ModelAttribute User user) {
	}

}
