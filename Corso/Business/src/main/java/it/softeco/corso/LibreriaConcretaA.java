package it.softeco.corso;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

@Named("a")
@QualA
public class LibreriaConcretaA implements Libreria {

	public void aggiungiLibroSeNonEsiste(Libro l) {
		System.out.println("chiamata a aggiungiLibroSeNonEsiste di LibreriaConcretaA");
	}

}
