package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
	
	Map<String, ReaderApplicant> readerApplicantMap;
	
//	@Autowired
//	private ReaderApplicantController readerApplicantController;
	
	public Collection<ReaderApplicant> getReaderApplicant(){
		return readerApplicantMap.values();
	};

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
	readerApplicantMap = new HashMap<String, ReaderApplicant>();
	
	FileReader file = new FileReader("files/readerApplicant.txt");
	BufferedReader reader = new BufferedReader(file);
	
	String line = reader.readLine();
	String[] fields = null;
	
	while(line != null) {
		
		fields = line.split(";");
		
		ReaderApplicant readerApplicant = new ReaderApplicant(
				fields[0], 
				fields[1], 
				fields[2]
		);
		
		readerApplicantMap.put(readerApplicant.getCpf(), readerApplicant);
		
		line = reader.readLine();
		
	}
	
	for(ReaderApplicant readerApplicant : readerApplicantMap.values()) {
		System.out.println("[ReaderApplicant] successfully rented: " + readerApplicant);
	}
	
//	readerApplicantController.setReaderApplicants(readerApplicantMap.values());
	
	reader.close();
	}
}
