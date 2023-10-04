package br.edu.infnet.libraryapp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.libraryapp.ReaderApplicantLoader;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Controller
public class ReaderApplicantController {
	
//	private Collection<ReaderApplicant> readerApplicants;
//	
//	public void setReaderApplicants(Collection<ReaderApplicant> readerApplicants){
//		this.readerApplicants = readerApplicants;
//	};
	
	@Autowired
	private ReaderApplicantLoader readerApplicantLoader;
	
	@GetMapping(value = "/readerapplicant/list")
	public String readerApplicantScreen(Model model) {
				
		model.addAttribute("listOfReadersApplicant", readerApplicantLoader.getReaderApplicant());
		
		return "readerapplicant/list";
	};

}
