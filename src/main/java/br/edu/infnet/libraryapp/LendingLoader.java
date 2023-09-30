package br.edu.infnet.libraryapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Lending;

@Component
public class LendingLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Lending lend = new Lending();
		
		System.out.println("Success" + lend);
		
	}

}
