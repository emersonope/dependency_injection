package br.edu.infnet.libraryapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Book;

@Component
public class BookLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Book lend = new Book("Jose", "Escritor", 10, "Emerson", true);
		
		System.out.println("Success" + lend);
		
	}

}
