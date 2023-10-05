package br.edu.infnet.libraryapp.model.business;

public class Cd extends LibraryItem {
	
//	private int id;
	private String cdName;
	private int numberOfTracks;
	private String director;
	private boolean availableCd;
	
	public Cd() {};

	public Cd(String type, String autor, float value, int codeNumber, String cdName, int numberOfTracks, String director, boolean availableCd) {
		super(type, autor, value, codeNumber);
		this.cdName = cdName;
		this.numberOfTracks = numberOfTracks;
		this.director = director;
		this.availableCd = availableCd;
	}

	@Override
	public String toString() {
		return String.format(
				"%s;%s;%d%s;%s",
				super.toString(),
				cdName,
				numberOfTracks,
				director,
				availableCd		
		);
	}	
}
