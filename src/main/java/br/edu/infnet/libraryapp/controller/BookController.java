package br.edu.infnet.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.libraryapp.BookLoader;

@Controller
public class BookController {
	
	@Autowired
	private BookLoader bookLoader;
	
	@GetMapping(value = "/book/listbook")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfBook", bookLoader.getBook());
		
		return "book/listbook";
	};

}
