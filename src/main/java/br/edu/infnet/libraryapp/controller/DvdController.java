package br.edu.infnet.libraryapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.libraryapp.model.business.Dvd;

@Controller
public class DvdController {
	
	Map<Integer, Dvd> dvdMap = new HashMap<Integer, Dvd>();
	
	public Collection<Dvd> getBook(){
		return dvdMap.values();
	};
	
	public void insert(Dvd dvd) {
		dvdMap.put(dvd.getCodeNumber(), dvd);
		System.out.println("[DVD] successfully rented: " + dvd);
	};
	
	public void delete(int codeNumber) {
		dvdMap.remove(codeNumber);
	};

	@GetMapping(value = "/dvd/listdvd")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfDvd", getBook());
		
		return "dvd/listdvd";
	};
	
	@GetMapping(value = "/dvd/{codeNumber}/delete")
	public String deleteApplicantByCpf(@PathVariable int codeNumber) {

		delete(codeNumber);

		return "redirect:/dvd/listdvd";
	};

}
