package br.edu.infnet.libraryapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Lending;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Order(4)
@Component
public class MapLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		ReaderApplicant r1 = new ReaderApplicant("name", "cpf", "email");
		
		List<ReaderApplicant> list = new ArrayList<ReaderApplicant>();
		
		
		
	}

}
