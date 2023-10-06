package br.edu.infnet.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.libraryapp.model.business.Dvd;
import br.edu.infnet.libraryapp.model.service.DvdService;

@Controller
public class DvdController {
	
	@Autowired
	private DvdService dvdService;

	@GetMapping(value = "/dvd/listdvd")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfDvd", dvdService.getBook());
		
		return "dvd/listdvd";
	};
	
	@GetMapping(value = "/dvd/registration")
	public String BookSignUpScreen() {

		return "dvd/registration";
	};
	
	@PostMapping(value="/dvd/insert")
	public String insert(Dvd dvd) {
		
		dvdService.insert(dvd);
		return "redirect:/dvd/listdvd";
	};
	
	@GetMapping(value = "/dvd/{codeNumber}/delete")
	public String deleteBookByCpf(@PathVariable int codeNumber) {

		dvdService.delete(codeNumber);

		return "redirect:/dvd/listdvd";
	};

}
