package br.edu.infnet.libraryapp.model.business;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String pswd;
	@OneToMany
	@JoinColumn(name = "idUer")
	private List<ReaderApplicant> readerApplicant;
	
	public User() {}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPswd() {
		return pswd;
	}


	public void setPswd(String pswd) {
		this.pswd = pswd;
	}


	public List<ReaderApplicant> getReaderApplicant() {
		return readerApplicant;
	}

	public void setReaderApplicant(List<ReaderApplicant> readerApplicant) {
		this.readerApplicant = readerApplicant;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	};		
}
