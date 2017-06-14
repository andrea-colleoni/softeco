package it.softeco.corso;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Autore {

	@Id
	@Column(name="idautore")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="nome_autore")
	String nome;
	@Column(name="cognome_autore")
	String cognome;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="libro_autore", joinColumns={
			@JoinColumn(referencedColumnName="idautore",columnDefinition="id_autore")
	}, inverseJoinColumns={
			@JoinColumn(referencedColumnName="id", columnDefinition="id_libro")
	})
	List<Libro> libri;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
}
