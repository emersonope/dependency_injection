package br.edu.infnet.libraryapp.controller;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.libraryapp.model.business.Lending;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;
import br.edu.infnet.libraryapp.model.service.LendingService;

@Controller
public class LendingController {
	
	@Autowired
	private LendingService lendingService;

	@GetMapping(value = "/lending/list")
	public String readerApplicantScreen(Model model) {

		model.addAttribute("listOfLending", lendingService.getLending());

		return "lending/list";
	};
	
	@GetMapping(value = "/lending/{data}/delete")
	public String deleteApplicantByCpf(@PathVariable LocalDateTime data) {

		lendingService.delete(data);

		return "redirect:/lending/list";
	};
}
