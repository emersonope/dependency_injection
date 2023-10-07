package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.ReaderApplicant;
import br.edu.infnet.libraryapp.model.repository.ReaderApplicantRepository;

@Service
public class ReaderApplicantService {
	
	@Autowired
	private ReaderApplicantRepository readerApplicantRepository;

	public Collection<ReaderApplicant> getReaderApplicant() {
		
		
		return (Collection<ReaderApplicant>) readerApplicantRepository.findAll();
	};
	
	public void insert(ReaderApplicant readerApplicant) {
		
		readerApplicantRepository.save(readerApplicant);
	};
	
	public void delete(Integer id) {
		
		readerApplicantRepository.deleteById(id);;
	};

}
