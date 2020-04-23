package com.its.thymleaf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotificationsContrller {

	@RequestMapping("/notifications")
	public String loadPage() {
		// TODO Auto-generated method stub
		return "notifications";
	}
}
