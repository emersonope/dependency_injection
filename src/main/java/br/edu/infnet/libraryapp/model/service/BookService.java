package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Book;
import br.edu.infnet.libraryapp.model.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Collection<Book> getBook(){
		
		return (Collection<Book>) bookRepository.findAll()
;	};
	
	public void insert(Book book) {
		
		bookRepository.save(book);
	};
	
	public void delete(Integer id) {
		
		bookRepository.deleteById(id);
	};
}
