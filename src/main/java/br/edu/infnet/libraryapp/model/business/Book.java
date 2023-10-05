package br.edu.infnet.libraryapp.model.business;

public class Book extends LibraryItem {
	
//	private int id;
	private String bookName;
	private String writer;
	private boolean availableBook;
	
	public Book() {};

	public Book(String type, String autor, float value, int codeNumber, String bookName, String writer, boolean availableBook) {
		super(type, autor, value, codeNumber);
		this.bookName = bookName;
		this.writer = writer;
		this.availableBook = availableBook;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s;%s", 
				super.toString(),
				bookName, 
				writer,
				availableBook
		);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public boolean isAvailableBook() {
		return availableBook;
	}

	public void setAvailableBook(boolean availableBook) {
		this.availableBook = availableBook;
	}
}
