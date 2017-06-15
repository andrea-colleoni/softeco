package it.softeco.corso;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class LibreriaFactory {

	
	@QualF(FactoryEnum.a) @Produces Libreria creaLibreriaA() {
		Libreria l = null;
		l = new LibreriaConcretaA();
			
		System.out.println("Factory!");
		// configurazione di l
		return l;
	}
	
	@QualF(FactoryEnum.b) @Produces Libreria creaLibreriaB() {
		Libreria l = null;
		l = new LibreriaConcretaB();

		 
		System.out.println("Factory!");
		// configurazione di l
		return l;
	}	
}
