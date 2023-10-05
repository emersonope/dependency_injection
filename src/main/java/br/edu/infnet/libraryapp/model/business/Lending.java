package br.edu.infnet.libraryapp.model.business;

import java.time.LocalDateTime;
import java.util.List;

public class Lending  {
	
//	private int id;
	private String description;
	private LocalDateTime data;
	private boolean web;
	private ReaderApplicant readerApplicant;
	private List<LibraryItem> libraryItems;
	
	public Lending() {
		description = "First Purchase";
		data = LocalDateTime.now();
		web = true;
	}
	
	public Lending(String description, ReaderApplicant readerApplicant, List<LibraryItem> libraryItems) {
		this();
		this.description = description;
		this.readerApplicant = readerApplicant;
		this.libraryItems = libraryItems;
	};

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public ReaderApplicant getReaderApplicant() {
		return readerApplicant;
	}

	public void setReaderApplicant(ReaderApplicant readerApplicant) {
		this.readerApplicant = readerApplicant;
	}

	public List<LibraryItem> getLibraryItems() {
		return libraryItems;
	}

	public void setLibraryItems(List<LibraryItem> libraryItems) {
		this.libraryItems = libraryItems;
	}

	@Override
	public String toString() {
		return description + "; " + data + ";" + web + ";" + readerApplicant + ";" + libraryItems.size();
	}
}
