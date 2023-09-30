package br.edu.infnet.libraryapp.model.business;

public class Cd extends LibraryItem {
	
	private int id;
	private String director;
	private boolean availableCd;

	public Cd(String name, String autor, float value, String director, boolean availableCd) {
		super(name, autor, value);
		this.director = director;
		this.availableCd = availableCd;
	}

	@Override
	public String toString() {
		return String.format(
				"%s;%s;%s",
				super.toString(),
				director,
				availableCd		
		);
	}

	
	
}
