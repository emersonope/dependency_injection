package br.edu.infnet.libraryapp.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Lending;
import br.edu.infnet.libraryapp.model.business.ReaderApplicant;

@Service
public class LendingService {
	
	Map<LocalDateTime, Lending> lendingMap = new HashMap<LocalDateTime, Lending>();

	Map<String, ReaderApplicant> readerApplicantMap = new HashMap<String, ReaderApplicant>();

	public Collection<Lending> getLending() {
		return lendingMap.values();
	};
	
	public void insert(Lending lending) {
		lendingMap.put(lending.getData(), lending);
		System.out.println("[Lending] successfully rented: " + lending);
	};
	
	public void delete(LocalDateTime data) {
		lendingMap.remove(data);
	};

}
