package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.controller.BookController;
import br.edu.infnet.libraryapp.model.business.Book;

@Order(1)
@Component
public class BookLoader implements ApplicationRunner {
	
	@Autowired
	private BookController bookController;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
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
			
			bookController.insert(rentedBook);
			
			line = reader.readLine();
			
		}
		
		reader.close();
		
	}

}
