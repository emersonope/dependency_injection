package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Book;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Order(1)
@Component
public class BookLoader implements ApplicationRunner {
	
	Map<Integer, Book> bookMap;
	
	public Collection<Book> getBook(){
		return bookMap.values();
	};

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		bookMap = new HashMap<Integer, Book>();
		
		FileReader file = new FileReader("files/book.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		String[] fields = null;
		
		while(line != null) {
			
			fields = line.split(";");
			
			Book rentedBook = new Book(
					fields[0], 
					fields[1], 
					Float.valueOf(fields[2]), 
					Integer.valueOf(fields[3]), 
					fields[4], 
					fields[5], 
					Boolean.valueOf(fields[6])
					);
			
			bookMap.put(rentedBook.getCodeNumber(), rentedBook);
			
			line = reader.readLine();
			
		}
		
		for(Book book : bookMap.values()) {
			System.out.println("[Book] successfully rented: " + book);
		}
		
		reader.close();
		
	}

}
