package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.controller.LendingController;
import br.edu.infnet.libraryapp.model.business.Book;
import br.edu.infnet.libraryapp.model.business.Cd;
import br.edu.infnet.libraryapp.model.business.Dvd;
import br.edu.infnet.libraryapp.model.business.Lending;
import br.edu.infnet.libraryapp.model.business.LibraryItem;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Order(5)
@Component
public class LendingLoader implements ApplicationRunner {
	
	@Autowired
	private LendingController lendingController;

	private static final Logger logger = LoggerFactory.getLogger(LendingLoader.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/lending.txt");
		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();
		String[] fields = null;
		Lending lending = null;

		while (line != null) {

			fields = line.split(";");

			switch (fields[0]) {
			case "L":
				logger.info("Iniciando execução de L " + getClass().getSimpleName());
				lending = new Lending(fields[1], new ReaderApplicant(fields[2], fields[3], fields[4]),
						new ArrayList<LibraryItem>());
//				lendingController.put(lending.getData(), lending);
				lendingController.insert(lending);
				logger.info("Finalizando execução de L " + getClass().getSimpleName());

				break;
			case "B":
				logger.info("Iniciando execução de B " + getClass().getSimpleName());
				Book book = new Book(fields[1], fields[2], Float.valueOf(fields[3]), Integer.valueOf(fields[4]),
						fields[5], fields[6], Boolean.valueOf(fields[7]));

				lending.getLibraryItems().add(book);

				logger.info("Finalizando execução de B " + getClass().getSimpleName());

				break;

			case "C":
				logger.info("Iniciando execução de C " + getClass().getSimpleName());
				Cd cd = new Cd(fields[1], fields[2], Float.valueOf(fields[3]), Integer.valueOf(fields[4]), fields[5],
						Integer.valueOf(fields[6]), fields[7], Boolean.valueOf(fields[8]));

				lending.getLibraryItems().add(cd);
				logger.info("Finalizando execução de C " + getClass().getSimpleName());
				break;

			case "D":
				logger.info("Iniciando execução de D " + getClass().getSimpleName());
				Dvd dvd = new Dvd(fields[1], fields[2], Float.valueOf(fields[3]), Integer.valueOf(fields[4]), fields[5],
						fields[6], Boolean.valueOf(fields[7]));

				lending.getLibraryItems().add(dvd);
				logger.info("Finalizando execução de D " + getClass().getSimpleName());
				break;

			}
			line = reader.readLine();
		}

//		for (Lending l : lendingMap.values()) {
//			System.out.println("[Lending] successfully rented: " + l);
//		}

		reader.close();
	}

}
