package br.edu.infnet.libraryapp.model.business;

public class Book extends LibraryItem {
	
	private int id;
	private String bookName;
	private boolean availableBook;
	
	public Book(String name, String autor, float value, String lenderName, boolean activeLending) {
		super(name, autor, value);
		this.bookName = lenderName;
		this.availableBook = activeLending;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s", 
				super.toString(),
				bookName, 
				availableBook
		);
	}
}
