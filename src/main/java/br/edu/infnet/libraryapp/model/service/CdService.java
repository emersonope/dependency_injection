package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.Cd;
import br.edu.infnet.libraryapp.model.repository.CdRepository;

@Service
public class CdService {
	
	@Autowired
	private CdRepository cdRepository;
	
	public Collection<Cd> getCd(){
		
		return (Collection<Cd>) cdRepository.findAll();
	};
	
	public void insert(Cd cd) {
		
		cdRepository.save(cd);
	};
	
	public void delete(Integer id) {
		
		cdRepository.deleteById(id);
	};

}
