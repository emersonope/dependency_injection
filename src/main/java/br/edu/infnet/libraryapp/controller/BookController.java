package br.edu.infnet.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.libraryapp.model.business.Book;
import br.edu.infnet.libraryapp.model.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping(value = "/book/listbook")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfBook", bookService.getBook());
		
		return "book/listbook";
	};
	
	@GetMapping(value = "/book/registration")
	public String readerApplicantSignUpScreen() {

		return "book/registration";
	};
	
	@PostMapping(value="/book/insert")
	public String insert(Book book) {
		
		bookService.insert(book);
		return "redirect:/book/listbook";
	};
	
	@GetMapping(value = "/book/{codeNumber}/delete")
	public String deleteApplicantByCpf(@PathVariable int codeNumber) {

		bookService.delete(codeNumber);

		return "redirect:/book/listbook";
	};

}
