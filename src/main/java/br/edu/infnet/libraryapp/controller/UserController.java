package br.edu.infnet.libraryapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.libraryapp.model.business.ReaderApplicant;
import br.edu.infnet.libraryapp.model.business.User;

@SessionAttributes("username")
@Controller
public class UserController {

	Map<String, User> userMap = new HashMap<String, User>();

	public Collection<User> getUser() {
		return userMap.values();
	};
	
	public void insert(User user) {
		userMap.put(user.getEmail(), user);
		System.out.println("[User] successfully included: " + user);
	};
	
	public void delete(String email) {
		userMap.remove(email);
	};

	@GetMapping(value = "/user/list")
	public String userList(Model model) {

		model.addAttribute("listOfUser", getUser());

		return "user/list";
	};
	
	@GetMapping(value = "/user/registration")
	public String userRegistration() {
		return "user/registration";
	};
	
	@PostMapping(value="/user/register")
	public String regristration(User user) {
		
		insert(user);
		
		return "redirect:/";
	};
	
	@PostMapping(value="/validate")
	public String validateLogin(Model model, @RequestParam String email, @RequestParam String pswd){
		
		User user = validate(email, pswd);
		
		if(validate(email, pswd) != null) {
			model.addAttribute("username", user.getName());
			
			return "redirect:/";	
		}
		return "redirect:/login";
	};
	
	public User validate(String email, String pswd) {
		
		User user = userMap.get(email);
		if(user!=null) {
			if(pswd.equalsIgnoreCase(user.getPswd())){
				return user;
			}
		};	
		
		return null;
	};

	
	@GetMapping(value = "/user/{email}/delete")
	public String deleteApplicantByCpf(@PathVariable String email) {

		delete(email);

		return "redirect:/user/list";
	};
}
