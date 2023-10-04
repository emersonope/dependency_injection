package br.edu.infnet.libraryapp.model.business;

public abstract class LibraryItem {
	
	private int id;
	private String type;
	private String autor;
	private float value;
	private int codeNumber;
	
	public LibraryItem () {};
	
	public LibraryItem(String type, String autor, float value, int codeNumber) {
		this.type = type;
		this.autor = autor;
		this.value = value;
		this.codeNumber = codeNumber;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%.2f;%d", type, autor, value,codeNumber);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public int getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(int codeNumber) {
		this.codeNumber = codeNumber;
	}
	
}
