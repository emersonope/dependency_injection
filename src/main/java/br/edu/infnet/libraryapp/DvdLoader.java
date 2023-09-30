package br.edu.infnet.libraryapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Dvd;

@Component
public class DvdLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Dvd DvdLend = new Dvd("livro name", "o autor", 44, 26, "o artista", true);
		
		System.out.println("Success" + DvdLend);
		
	}

}
