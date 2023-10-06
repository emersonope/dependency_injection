package br.edu.infnet.libraryapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.libraryapp.model.business.Cd;

@Controller
public class CdController {
	
	Map<Integer, Cd> cdMap = new HashMap<Integer, Cd>();
	
	public Collection<Cd> getCd(){
		return cdMap.values();
	};
	
	public void insert(Cd cd) {
		cdMap.put(cd.getCodeNumber(), cd);
		System.out.println("[Cd] successfully rented: " + cd);
	};
	
	public void delete(int codeNumber) {
		cdMap.remove(codeNumber);
	};

	@GetMapping(value = "/cd/listcd")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfCd", getCd());
		
		return "cd/listcd";
	};
	
	@GetMapping(value = "/cd/{codeNumber}/delete")
	public String deleteApplicantByCpf(@PathVariable int codeNumber) {

		delete(codeNumber);

		return "redirect:/cd/listcd";
	};

}
