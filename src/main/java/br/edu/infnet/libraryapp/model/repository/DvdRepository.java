package br.edu.infnet.libraryapp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.libraryapp.model.business.Dvd;

@Repository
public interface DvdRepository extends CrudRepository<Dvd, Integer>{

}
