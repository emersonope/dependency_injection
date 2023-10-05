package br.edu.infnet.libraryapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Controller
public class ReaderApplicantController {

	Map<String, ReaderApplicant> readerApplicantMap = new HashMap<String, ReaderApplicant>();

	public Collection<ReaderApplicant> getReaderApplicant() {
		return readerApplicantMap.values();
	};
	
	public void insert(ReaderApplicant readerApplicant) {
		readerApplicantMap.put(readerApplicant.getCpf(), readerApplicant);
		System.out.println("[ReaderApplicant] successfully rented: " + readerApplicant);
	};
	
	public void delete(String cpf) {
		readerApplicantMap.remove(cpf);
	};

	@GetMapping(value = "/readerapplicant/list")
	public String readerApplicantScreen(Model model) {

		model.addAttribute("listOfReadersApplicant", getReaderApplicant());

		return "readerapplicant/list";
	};

	
	@GetMapping(value = "/readerapplicant/{cpf}/delete")
	public String deleteApplicantByCpf(@PathVariable String cpf) {

		delete(cpf);

		return "redirect:/readerapplicant/list";
	};
}
