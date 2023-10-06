package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Service
public class ReaderApplicantService {
	
	Map<String, ReaderApplicant> readerApplicantMap = new HashMap<String, ReaderApplicant>();

	public Collection<ReaderApplicant> getReaderApplicant() {
		return readerApplicantMap.values();
	};
	
	public void insert(ReaderApplicant readerApplicant) {
		readerApplicantMap.put(readerApplicant.getCpf(), readerApplicant);
		System.out.println("[ReaderApplicant] successfully rented: " + readerApplicant);
	};
	
	public void delete(String cpf) {
		readerApplicantMap.remove(cpf);
	};

}
