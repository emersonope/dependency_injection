package br.edu.infnet.libraryapp.model.business;

public class ReaderApplicant {
	
	private String name;
	private String cpf;
	private String email;
	
	public ReaderApplicant() {};
	
	public ReaderApplicant(String name, String cpf, String email) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format(
				"%s;%s; %s",
				name,
				cpf,
				email
		);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
