package br.edu.infnet.libraryapp.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.libraryapp.model.business.Book;

@Controller
public class BookController {
	
	Map<Integer, Book> bookMap = new HashMap<Integer, Book>();
	
	public Collection<Book> getBook(){
		return bookMap.values();
	};
	
	public void insert(Book book) {
		bookMap.put(book.getCodeNumber(), book);
		System.out.println("[Book] successfully rented: " + book);
	};
	
	public void delete(int codeNumber) {
		bookMap.remove(codeNumber);
	};

	@GetMapping(value = "/book/listbook")
	public String bookLoaderScreen(Model model) {
				
		model.addAttribute("listOfBook", getBook());
		
		return "book/listbook";
	};
	
	@GetMapping(value = "/book/{codeNumber}/delete")
	public String deleteApplicantByCpf(@PathVariable int codeNumber) {

		delete(codeNumber);

		return "redirect:/book/listbook";
	};

}
