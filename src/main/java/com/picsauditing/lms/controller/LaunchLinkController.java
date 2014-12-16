package com.picsauditing.lms.controller;

import com.picsauditing.lms.common.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/link")
public class LaunchLinkController {

	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public void getLaunchLink(@ModelAttribute User user) {
	}

}
