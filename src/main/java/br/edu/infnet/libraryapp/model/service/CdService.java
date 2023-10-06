package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Cd;

@Service
public class CdService {
	
	Map<Integer, Cd> cdMap = new HashMap<Integer, Cd>();
	
	public Collection<Cd> getCd(){
		return cdMap.values();
	};
	
	public void insert(Cd cd) {
		cdMap.put(cd.getCodeNumber(), cd);
		System.out.println("[Cd] successfully rented: " + cd);
	};
	
	public void delete(int codeNumber) {
		cdMap.remove(codeNumber);
	};

}
