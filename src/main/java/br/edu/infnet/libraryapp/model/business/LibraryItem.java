package br.edu.infnet.libraryapp.model.business;

public abstract class LibraryItem {
	
	private int id;
	private String name;
	private String autor;
	private float value;
	
	public LibraryItem(String name, String autor, float value) {
		this.name = name;
		this.autor = autor;
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%.2f", name, autor, value);
	}
	
}
