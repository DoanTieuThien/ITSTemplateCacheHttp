package com.its.thymleaf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IconController {

	@RequestMapping("/icons")
	public String loadPage() {
		return "icons";
	}
}
