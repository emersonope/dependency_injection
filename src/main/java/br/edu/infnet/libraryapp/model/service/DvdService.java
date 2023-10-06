package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Dvd;

@Service
public class DvdService {
	
	Map<Integer, Dvd> dvdMap = new HashMap<Integer, Dvd>();
	
	public Collection<Dvd> getBook(){
		return dvdMap.values();
	};
	
	public void insert(Dvd dvd) {
		dvdMap.put(dvd.getCodeNumber(), dvd);
		System.out.println("[DVD] successfully rented: " + dvd);
	};
	
	public void delete(int codeNumber) {
		dvdMap.remove(codeNumber);
	};

}
