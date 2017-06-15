package it.softeco.corso.ejb;

import javax.ejb.Stateless;

@Stateless
public class EsempioEjb implements InterfacciaEjb {

	public String doSomething() {
		return "ciao";
	}

}
