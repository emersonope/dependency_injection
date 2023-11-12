package br.edu.infnet.libraryapp.model.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cd extends LibraryItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCdName() {
		return cdName;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public boolean isAvailableCd() {
		return availableCd;
	}

	public void setAvailableCd(boolean availableCd) {
		this.availableCd = availableCd;
	}

}
