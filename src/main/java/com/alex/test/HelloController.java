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

}