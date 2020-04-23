package com.its.thymleaf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RtlController {

	@RequestMapping("/rtl")
	public String loadPage() {
		return "rtl";
	}
}
