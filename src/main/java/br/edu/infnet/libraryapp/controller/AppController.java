package br.edu.infnet.libraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpSession;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String homeScreen() {
		return "home";
	};
	
	@GetMapping(value = "/login")
	public String loginScreen() {
		return "login";
	};
	
	@GetMapping(value = "/logout")
	public String logoutScreen(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/";
	};
}
