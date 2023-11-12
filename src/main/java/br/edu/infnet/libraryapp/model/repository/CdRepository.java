package br.edu.infnet.libraryapp.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.libraryapp.model.business.Cd;

public interface CdRepository  extends CrudRepository<Cd, Integer> {
	
	

}
