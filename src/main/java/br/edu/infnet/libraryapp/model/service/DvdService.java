package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Dvd;
import br.edu.infnet.libraryapp.model.repository.DvdRepository;

@Service
public class DvdService {
	
	@Autowired
	private DvdRepository dvdRepository; 
	
	public Collection<Dvd> getBook(){
		
		return (Collection<Dvd>) dvdRepository.findAll();
	};
	
	public void insert(Dvd dvd) {
		
		dvdRepository.save(dvd);
	};
	
	public void delete(Integer id) {
		
		dvdRepository.deleteById(id);
		
	};

}
