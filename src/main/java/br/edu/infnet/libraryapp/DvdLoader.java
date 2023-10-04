package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.Dvd;

@Order(3)
@Component
public class DvdLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<Integer, Dvd> dvdMap = new HashMap<Integer, Dvd>();
		
		FileReader file = new FileReader("files/dvd.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		String[] fields = null;
		
		while(line != null) {
			
			fields = line.split(";");
			
			Dvd rentedDvd = new Dvd(
					fields[0], 
					fields[1], 
					Float.valueOf(fields[2]), 
					Integer.valueOf(fields[3]), 
					fields[4], 
					fields[5], 
					Boolean.valueOf(fields[6])
					);
			
			dvdMap.put(rentedDvd.getCodeNumber(), rentedDvd);
			
			line = reader.readLine();
			
		}
		
		for(Dvd dvd : dvdMap.values()) {
			System.out.println("[DVD] successfully rented: " + dvd);
		}
		
		reader.close();
		
	}
}
