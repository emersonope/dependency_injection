package br.edu.infnet.libraryapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Cd;

@Component
public class CdLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Cd cdLend = new Cd("Jose", "Escritor", 22, "O diretor", true);
		
		System.out.println("Success" + cdLend);
		
	}

}
