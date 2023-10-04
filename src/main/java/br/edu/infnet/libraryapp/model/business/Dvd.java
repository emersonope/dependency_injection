package br.edu.infnet.libraryapp.model.business;

public class Dvd extends LibraryItem {
	
	private String dvdName;
	private String artist;
	private boolean availableDvd;
	
	public Dvd() {};

	public Dvd(String type, String autor, float value, int codeNumber, String dvdName, String artist, boolean availableDvd) {
		super(type, autor, value, codeNumber);
		this.dvdName = dvdName;
		this.artist = artist;
		this.availableDvd = availableDvd;
	}


	@Override
	public String toString() {
		return String.format(
				"%s;%s;%s;%s",
				super.toString(),
				dvdName,
				artist,
				availableDvd
		);
	}
	
	

}
