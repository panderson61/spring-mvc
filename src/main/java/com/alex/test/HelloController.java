package com.alex.test;

import com.alex.test.dao.TestDAO;
import com.alex.test.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private TestDAO testDAO;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");

		Test test = new Test();
		test.setName("Alex");
		test.setTimestamp(new Date());
		testDAO.save(test);

		return "hello";
	}

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(ModelMap model) {
		model.addAttribute("message", "Hello world!");

		return "hello";
	}

	@RequestMapping(value = "v1", method = RequestMethod.GET)
	public String v1(ModelMap model) {
		model.addAttribute("message", "Hello world!");

		return "hello";
	}

	@RequestMapping(value = "v1/lms", method = RequestMethod.GET)
	public String v1Lms(ModelMap model) {
		model.addAttribute("message", "Hello world!");

		return "hello";
	}
}