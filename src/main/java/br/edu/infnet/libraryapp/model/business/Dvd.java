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

	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public boolean isAvailableDvd() {
		return availableDvd;
	}

	public void setAvailableDvd(boolean availableDvd) {
		this.availableDvd = availableDvd;
	}

}
