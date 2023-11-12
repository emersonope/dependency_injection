package br.edu.infnet.libraryapp.model.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dvd extends LibraryItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
