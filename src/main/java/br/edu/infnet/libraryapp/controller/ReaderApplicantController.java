package br.edu.infnet.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.libraryapp.model.business.ReaderApplicant;
import br.edu.infnet.libraryapp.model.service.ReaderApplicantService;

@Controller
public class ReaderApplicantController {

	@Autowired
	private ReaderApplicantService readerApplicantService;
	
	@GetMapping(value = "/readerapplicant/list")
	public String readerApplicantScreen(Model model) {

		model.addAttribute("listOfReadersApplicant", readerApplicantService.getReaderApplicant());

		return "readerapplicant/list";
	};
	
	@GetMapping(value = "/readerapplicant/registration")
	public String readerApplicantSignUpScreen() {

		return "readerapplicant/registration";
	};
	
	@PostMapping(value="/readerapplicant/insert")
	public String insert(ReaderApplicant readerApplicant) {
		
		readerApplicantService.insert(readerApplicant);
		return "redirect:/readerapplicant/list";
	};
	
	@GetMapping(value = "/readerapplicant/{cpf}/delete")
	public String deleteApplicantByCpf(@PathVariable String cpf) {

		readerApplicantService.delete(cpf);

		return "redirect:/readerapplicant/list";
	};
}
