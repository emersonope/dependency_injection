package br.edu.infnet.libraryapp.controller;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.libraryapp.model.business.Lending;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Controller
public class LendingController {
	
	Map<LocalDateTime, Lending> lendingMap = new HashMap<LocalDateTime, Lending>();

	Map<String, ReaderApplicant> readerApplicantMap = new HashMap<String, ReaderApplicant>();

	public Collection<Lending> getLending() {
		return lendingMap.values();
	};
	
	public void insert(Lending lending) {
		lendingMap.put(lending.getData(), lending);
		System.out.println("[Lending] successfully rented: " + lending);
	};
	
	public void delete(LocalDateTime data) {
		lendingMap.remove(data);
	};

	@GetMapping(value = "/lending/list")
	public String readerApplicantScreen(Model model) {

		model.addAttribute("listOfLending", getLending());

		return "lending/list";
	};

	
	@GetMapping(value = "/lending/{data}/delete")
	public String deleteApplicantByCpf(@PathVariable LocalDateTime data) {

		delete(data);

		return "redirect:/lending/list";
	};
}
