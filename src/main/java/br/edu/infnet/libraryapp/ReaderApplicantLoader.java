package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.controller.ReaderApplicantController;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Order(4)
@Component
public class ReaderApplicantLoader implements ApplicationRunner {

	@Autowired
	private ReaderApplicantController readerApplicantController;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/readerApplicant.txt");
		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();
		String[] fields = null;

		while (line != null) {

			fields = line.split(";");

			ReaderApplicant readerApplicant = new ReaderApplicant(fields[0], fields[1], fields[2]);

			readerApplicantController.insert(readerApplicant);

			line = reader.readLine();

		}

		reader.close();
	}
}
