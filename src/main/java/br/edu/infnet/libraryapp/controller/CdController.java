package br.edu.infnet.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.libraryapp.model.business.Cd;
import br.edu.infnet.libraryapp.model.service.CdService;

@Controller
public class CdController {
	
	@Autowired
	private CdService cdService;

	@GetMapping(value = "/cd/listcd")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfCd", cdService.getCd());
		
		return "cd/listcd";
	};
	
	@GetMapping(value = "/cd/registration")
	public String cdSignUpScreen() {

		return "cd/registration";
	};
	
	@PostMapping(value="/cd/insert")
	public String insert(Cd cd) {
		
		cdService.insert(cd);
		return "redirect:/cd/listcd";
	};
	
	@GetMapping(value = "/cd/{codeNumber}/delete")
	public String deleteApplicantByCpf(@PathVariable int codeNumber) {

		cdService.delete(codeNumber);

		return "redirect:/cd/listcd";
	};

}
