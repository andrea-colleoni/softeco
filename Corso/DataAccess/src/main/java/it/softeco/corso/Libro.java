package it.softeco.corso;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	String titolo;
	String autore;
	Date dataPubblicazione;
	String casaEditrice;
	
	@ManyToMany(mappedBy="libri", cascade=CascadeType.ALL)
	List<Autore> autori;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public Date getDataPubblicazione() {
		return dataPubblicazione;
	}
	public void setDataPubblicazione(Date dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}
	public String getCasaEditrice() {
		return casaEditrice;
	}
	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}
	public List<Autore> getAutori() {
		return autori;
	}
	public void setAutori(List<Autore> autori) {
		this.autori = autori;
	}
}
