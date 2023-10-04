package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Cd;

@Order(2)
@Component
public class CdLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	Map<Integer, Cd> cdMap = new HashMap<Integer, Cd>();
		
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
			
			cdMap.put(rentedCd.getCodeNumber(), rentedCd);
			
			line = reader.readLine();
			
		}
		
		for(Cd cd : cdMap.values()) {
			System.out.println("[CD] successfully rented: " + cd);
		}
		
		reader.close();
		
	}

}
