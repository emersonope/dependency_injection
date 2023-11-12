package br.edu.infnet.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.libraryapp.model.business.User;
import br.edu.infnet.libraryapp.model.service.UserService;

@SessionAttributes("user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value="/validate")
	public String validate(Model model, @RequestParam String email, @RequestParam String pswd){
		
		User user = userService.validate(email, pswd);
		
		if(user != null) {
			model.addAttribute("user", user);
			
			return "redirect:/";	
		}
		return "redirect:/login";
	};
	
	@GetMapping(value = "/user/list")
	public String userList(Model model) {

		model.addAttribute("listOfUser", userService.getUser());

		return "user/list";
	};
	
	@GetMapping(value = "/user/registration")
	public String userRegistration() {
		return "user/registration";
	};
	
	@PostMapping(value="/user/register")
	public String insert(User user) {
		
		userService.insert(user);
		
		return "redirect:/";
	};

	@GetMapping(value = "/user/{email}/delete")
	public String delete(@PathVariable Integer id) {

		userService.delete(id);

		return "redirect:/user/list";
	};
}
