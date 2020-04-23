package com.its.thymleaf.web.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ErrorContrllerImpl implements ErrorController {

	@RequestMapping("/error")
	public @ResponseBody String error() {
		// TODO Auto-generated method stub
		return "Error request Http";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

}
