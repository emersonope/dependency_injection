package br.edu.infnet.libraryapp.model.business;

import java.time.LocalDateTime;

public class Lending  {
	
	private int id;
	private String description;
	private LocalDateTime data;
	private boolean web;
	
	public Lending() {
		id = 1234;
		description = "First Purchase";
		data = LocalDateTime.now();
		web = true;
	}

	@Override
	public String toString() {
		return id + "; " + description + "; " + data + ";" + web;
	}
}
