package br.edu.infnet.libraryapp.model.business;

public class Dvd extends LibraryItem {
	
	private int numberOfTracks;
	private String artist;
	private boolean availableDvd;

	public Dvd(String name, String autor, float value, int numberOfTracks, String artist, boolean availableDvd) {
		super(name, autor, value);
		this.numberOfTracks = numberOfTracks;
		this.artist = artist;
		this.availableDvd = availableDvd;
	}

	@Override
	public String toString() {
		return String.format(
				"%s;%d;%s; %s",
				super.toString(),
				numberOfTracks,
				artist,
				availableDvd
		);
	}
	
	

}
