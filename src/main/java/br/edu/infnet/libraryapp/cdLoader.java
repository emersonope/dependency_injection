package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.controller.CdController;
import br.edu.infnet.libraryapp.model.business.Cd;

@Order(1)
@Component
public class cdLoader implements ApplicationRunner {
	
	@Autowired
	private CdController cdController;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/cd.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		String[] fields = null;
		
		while(line != null) {
			
			fields = line.split(";");
		
			Cd rentedCd = new Cd(
					fields[0], 
					fields[1], 
					Float.valueOf(fields[2]), 
					Integer.valueOf(fields[3]), 
					fields[4], 
					Integer.valueOf(fields[5]), 
					fields[6], 
					Boolean.valueOf(fields[7])
					);
			
			cdController.insert(rentedCd);
			
			line = reader.readLine();
			
		}
		
		reader.close();
		
	}

}
