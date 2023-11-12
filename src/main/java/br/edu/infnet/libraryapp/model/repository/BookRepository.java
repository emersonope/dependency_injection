package br.edu.infnet.libraryapp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.libraryapp.model.business.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
