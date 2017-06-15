package it.softeco.corso;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

@Named("b")
@QualB
public class LibreriaConcretaB implements Libreria {

	public void aggiungiLibroSeNonEsiste(Libro l) {
		System.out.println("chiamata a aggiungiLibroSeNonEsiste di LibreriaConcretaB");
	}

}
