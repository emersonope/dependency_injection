package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Book;

@Service
public class BookService {

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
}
