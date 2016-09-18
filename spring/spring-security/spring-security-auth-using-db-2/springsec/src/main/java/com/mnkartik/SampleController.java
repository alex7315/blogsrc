package com.mnkartik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String showHome() {
		return "home";
	}

}